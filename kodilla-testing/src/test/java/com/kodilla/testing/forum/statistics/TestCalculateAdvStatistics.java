package com.kodilla.testing.forum.statistics;

import org.junit.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

public class TestCalculateAdvStatistics {

    @Before
    public void testStart() {
        System.out.println("Test begin");
    }
    @After
    public void testStop() {
        System.out.println("Test stop");
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostIsZero() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> stubUserList = new ArrayList<>();
        for(int i=0; i<50; i++) {
            stubUserList.add("First name "+i+", Last Name"+i);
        }
        int allPosts = 0;
        int allComments = 1000;
        when(statisticsMock.usersNames()).thenReturn(stubUserList);
        when(statisticsMock.postsCount()).thenReturn(allPosts);
        when(statisticsMock.commentsCount()).thenReturn(allComments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostIsThousand() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> stubUserList = new ArrayList<>();
        for(int i=0; i<50; i++) {
            stubUserList.add("First name "+i+", Last Name"+i);
        }
        int allPosts = 1000;
        int allComments = 1000;
        when(statisticsMock.usersNames()).thenReturn(stubUserList);
        when(statisticsMock.postsCount()).thenReturn(allPosts);
        when(statisticsMock.commentsCount()).thenReturn(allComments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsIsZero() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> stubUserList = new ArrayList<>();
        for(int i=0; i<50; i++) {
            stubUserList.add("First name "+i+", Last Name"+i);
        }
        int allPosts = 1000;
        int allComments = 0;
        when(statisticsMock.usersNames()).thenReturn(stubUserList);
        when(statisticsMock.postsCount()).thenReturn(allPosts);
        when(statisticsMock.commentsCount()).thenReturn(allComments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsIsLowerThanPosts() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> stubUserList = new ArrayList<>();
        for(int i=0; i<50; i++) {
            stubUserList.add("First name "+i+", Last Name"+i);
        }
        int allPosts = 1000;
        int allComments =400;
        when(statisticsMock.usersNames()).thenReturn(stubUserList);
        when(statisticsMock.postsCount()).thenReturn(allPosts);
        when(statisticsMock.commentsCount()).thenReturn(allComments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentstIsHigherThanPosts() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> stubUserList = new ArrayList<>();
        for(int i=0; i<50; i++) {
            stubUserList.add("First name "+i+", Last Name"+i);
        }
        int allPosts = 1000;
        int allComments = 2000;
        when(statisticsMock.usersNames()).thenReturn(stubUserList);
        when(statisticsMock.postsCount()).thenReturn(allPosts);
        when(statisticsMock.commentsCount()).thenReturn(allComments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersIsZero() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> stubUserList = new ArrayList<>();

        int allPosts = 1000;
        int allComments = 2000;
        when(statisticsMock.usersNames()).thenReturn(stubUserList);
        when(statisticsMock.postsCount()).thenReturn(allPosts);
        when(statisticsMock.commentsCount()).thenReturn(allComments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

    }


    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersIsOneHundred() {

        Statistics statisticsMock = mock(Statistics.class);
        List<String> stubUserList = new ArrayList<>();
        for(int i=0; i<100; i++) {
            stubUserList.add("First name "+i+", Last Name"+i);
        }
        int allPosts = 1000;
        int allComments = 2000;
        when(statisticsMock.usersNames()).thenReturn(stubUserList);
        when(statisticsMock.postsCount()).thenReturn(allPosts);
        when(statisticsMock.commentsCount()).thenReturn(allComments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

    }

}
