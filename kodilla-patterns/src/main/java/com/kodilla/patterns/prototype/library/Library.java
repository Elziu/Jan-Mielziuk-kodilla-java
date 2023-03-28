package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype<Library> {

    final String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();

        for (Book book : books) {
            Book clonedBook = new Book(book.title,book.author,book.publicationDate);
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        if (!Objects.equals(name, library.name)) return false;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }
}
