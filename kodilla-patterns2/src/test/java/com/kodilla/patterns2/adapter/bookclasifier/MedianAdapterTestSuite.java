package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        Book libABook1 = new Book("author1", "title1", 2000, "1");
        Book libABook2 = new Book("author2", "title2", 1999, "2");
        Book libABook3 = new Book("author3", "title3", 1998, "3");
        Book libABook4 = new Book("author4", "title4", 1997, "4");
        Book libABook5 = new Book("author5", "title5", 1996, "5");

        Set<Book> testBookSet = new HashSet<>();
        testBookSet.add(libABook1);
        testBookSet.add(libABook2);
        testBookSet.add(libABook3);
        testBookSet.add(libABook4);
        testBookSet.add(libABook5);
        MedianAdapter medianAdapter = new MedianAdapter();
        int testMedianPublicationYear = medianAdapter.publicationYearMedian(testBookSet);

        Assert.assertEquals(1998, testMedianPublicationYear);
        testBookSet.removeAll(testBookSet);

    }
}
