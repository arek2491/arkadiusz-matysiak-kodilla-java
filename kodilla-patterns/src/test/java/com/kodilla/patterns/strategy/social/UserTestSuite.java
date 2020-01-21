package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User user1 = new Millenials("name1");
        User user2 = new YGeneration("name2");
        User user3 = new ZGeneration("name3");
        String name1SharePost = user1.sharePost();
        String name2SharePost = user2.sharePost();
        String name3SharePost = user3.sharePost();
        System.out.println("user 1 share: " + name1SharePost);
        System.out.println("user 2 share: " + name2SharePost);
        System.out.println("user3 share: " + name3SharePost);

        Assert.assertEquals("Facebook publisher", name1SharePost);
        Assert.assertEquals("Twitter publisher", name2SharePost);
        Assert.assertEquals("Snapchat publisher", name3SharePost);

    }

    @Test
    public void testIndividualSharingStrategy() {

        User undecidedUser = new Millenials("undecidedUser");
        String undecidedUserSharePost = undecidedUser.sharePost();
        System.out.println("Now I am: " + undecidedUserSharePost);

        undecidedUser.setSocialPublisher(new TwitterPublisher());
        undecidedUserSharePost = undecidedUser.sharePost();
        System.out.println("And now I am: " + undecidedUserSharePost);

        Assert.assertEquals("Twitter publisher", undecidedUserSharePost);

    }
}
