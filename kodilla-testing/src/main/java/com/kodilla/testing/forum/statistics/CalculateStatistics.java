package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {

    private int numOfUsers;
    private int numOfPosts;
    private int numOfComments;
    private double averagePostPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {

        numOfUsers = statistics.usersNames().size();
        numOfPosts = statistics.postsCount();
        numOfComments = statistics.commentsCount();
        try {
            averagePostPerUser = numOfPosts/numOfUsers;
        } catch(ArithmeticException e) {
            System.err.println("Number of users is 0, can't calculate average posts per user");
        }

        try {
            averageCommentsPerUser = numOfComments/numOfUsers;
        } catch(ArithmeticException e) {
            System.err.println("Number of users is 0, can't calculate average comments per user");
        }

        try {
            averageCommentsPerPost = numOfComments/numOfPosts;
        } catch(ArithmeticException e) {
            System.err.println("Number of post is 0, can't calculate average comments per post");
        }
        if(numOfComments ==0) {
            System.out.println("No Comments on forum");
        }

    }

    public void showStatistics() {

        System.out.println("Posts per user: " + averagePostPerUser);
        System.out.println("Comments per user: " + averageCommentsPerUser);
        System.out.println("Comments per posts: " + averageCommentsPerPost);

    }

}
