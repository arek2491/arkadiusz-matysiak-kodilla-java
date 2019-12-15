package com.kodilla.testing.library;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWhenUserHasZeroBooks(){

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser("Andrew", "Kowalski", "123456789");
        Book book = new Book("Harry Potter", "J.K Rowling", 2000);
        List<Book> resultListOfZeroBooks = new ArrayList<>();
        boolean isReadyToBorrow = true;
        int numOfBooks = 0;

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfZeroBooks);
        when(libraryDatabaseMock.rentABook(libraryUser, book)).thenReturn(isReadyToBorrow);
        when(libraryDatabaseMock.returnBooks(libraryUser)).thenReturn(numOfBooks);

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(0, resultListOfZeroBooks.size());


    }

    @Test
    public void testListBooksInHandsOfWhenUserHasOneBook(){

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser("Andrew", "Kowalski", "123456789");

        List<Book> resultListOfOneBooks = new ArrayList<>();
        resultListOfOneBooks.add(new Book("Harry Potter", "J.K Rowling", 2000));
        boolean isReadyToBorrow = false;
        int numOfBooks = 1;

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfOneBooks);
        when(libraryDatabaseMock.rentABook(libraryUser, new Book("Harry Potter", "J.K Rowling", 2000))).thenReturn(isReadyToBorrow);
        when(libraryDatabaseMock.returnBooks(libraryUser)).thenReturn(numOfBooks);

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(1, resultListOfOneBooks.size());

    }

    @Test
    public void testListBooksInHandsOfWhenUserHasFiveBooks(){

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser("Andrew", "Kowalski", "123456789");

        List<Book> resultListOfFiveBooks = new ArrayList<>();
        resultListOfFiveBooks.add(new Book("Harry Potter and The Goblet of Fire", "J.K Rowling", 2007));
        resultListOfFiveBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        resultListOfFiveBooks.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        resultListOfFiveBooks.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));
        resultListOfFiveBooks.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));

        boolean isReadyToBorrow = true;
        int numOfBooks = 5;

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfFiveBooks);
        when(libraryDatabaseMock.rentABook(libraryUser, new Book("Harry Potter", "J.K Rowling", 2000))).thenReturn(isReadyToBorrow);
        when(libraryDatabaseMock.returnBooks(libraryUser)).thenReturn(numOfBooks);

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(5, resultListOfFiveBooks.size());

    }
}
