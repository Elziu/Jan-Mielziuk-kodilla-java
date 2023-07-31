package com.kodilla.patterns2.adapter.bookClasifier;


import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class MedianAdapterTestSuite {

    @Test
    public void testTwoLibraries() {
        //Given
        Book book1 = new Book("author1","title1",1990);
        Book book2 = new Book("author2","title2",1991);
        Book book3 = new Book("author3","title3",1995);
        Book book4 = new Book("author4","title4",1996);
        Book book5 = new Book("author5","title5",1997);
        BookSignature bookSignature1 = new BookSignature("sign 1");
        BookSignature bookSignature2 = new BookSignature("sign 2");
        BookSignature bookSignature3 = new BookSignature("sign 3");
        BookSignature bookSignature4 = new BookSignature("sign 4");
        BookSignature bookSignature5 = new BookSignature("sign 5");
        Map<BookSignature, Book> testBooks = new HashMap<>();

        testBooks.put(bookSignature1, book1);
        testBooks.put(bookSignature2, book2);
        testBooks.put(bookSignature3, book3);
        testBooks.put(bookSignature4, book4);
        testBooks.put(bookSignature5, book5);


        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.medianPublicationYear(testBooks);
        //Then
        System.out.println(median);
        Assert.assertEquals(median, 1995 );
    }
}