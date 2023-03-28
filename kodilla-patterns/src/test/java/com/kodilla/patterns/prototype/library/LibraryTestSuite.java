package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        //preparing Books
        Book book1 = new Book("title1" , "author1" , LocalDate.of(1999,1,1));
        Book book2 = new Book("title2" , "author2" , LocalDate.of(2001,2,2));
        Book book3 = new Book("title3" , "author3" , LocalDate.of(2002,3,3));

        //creating Library
        Library library = new Library("library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making shallow copy of object
        Library cloneLibrary = null;
        try{
            cloneLibrary = library.shallowCopy();
        }
        catch (CloneNotSupportedException c){
            System.out.println(c.getStackTrace());
        }

        //making deep copy of object
        Library deeplyClonedLibrary = null;
        try{
            deeplyClonedLibrary = library.deepCopy();
            deeplyClonedLibrary.books.add(new Book("title4" , "author4" , LocalDate.of(1984,11,15)));
            deeplyClonedLibrary.books.add(new Book("title5" , "author5" , LocalDate.of(1974,11,17)));
        }
        catch (CloneNotSupportedException c){
            System.out.println(c.getStackTrace());
        }

        //When
        library.books.remove(book1);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deeplyClonedLibrary);
        assertEquals(2, library.books.size());
        assertEquals(2, cloneLibrary.books.size());
        assertEquals(5, deeplyClonedLibrary.books.size());
        assertNotEquals(deeplyClonedLibrary.getBooks(), library.getBooks());
        assertEquals(cloneLibrary.getBooks(), library.getBooks());

    }
}
