package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    public int numOfUsers;
    public int numOfPosts;
    public int numOfComments;
    public int averagePostPerUser;
    public int averageCommentsPerUser;
    public int averageCommentsPerPost;

    public CalculateStatistics(int numOfUsers, int numOfPosts, int numOfComments) {

        this.numOfUsers = numOfUsers;
        this.numOfPosts = numOfPosts;
        this.numOfComments = numOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        averagePostPerUser = numOfPosts/numOfUsers;
        averageCommentsPerUser = numOfComments/numOfUsers;
        averageCommentsPerPost = numOfComments/numOfPosts;

    }

    public void showStatistics() {

        System.out.println("Posts per user: " + averagePostPerUser);
        System.out.println("Comments per user: " + averageCommentsPerPost);
        System.out.println("Comments per posts: " + averageCommentsPerPost);

    }

}
