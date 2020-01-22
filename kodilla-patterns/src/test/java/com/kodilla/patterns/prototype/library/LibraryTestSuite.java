package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() throws CloneNotSupportedException {

        Library library = new Library("Lib1");
        LocalDate localDate1 = LocalDate.of(1991,1,12);
        LocalDate localDate2 = LocalDate.of(2000,2,13);
        LocalDate localDate3 = LocalDate.of(2010,4,3);
        Book book1 = new Book("book1", "author1", localDate1);
        Book book2 = new Book("book2", "author2", localDate2);
        Book book3 = new Book("book3", "author3", localDate3);
        Book book4 = new Book("book4", "author4", localDate1);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        clonedLibrary = library.shallowCopy();
        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();

        library.getBooks().add(book4);

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());

    }
}
