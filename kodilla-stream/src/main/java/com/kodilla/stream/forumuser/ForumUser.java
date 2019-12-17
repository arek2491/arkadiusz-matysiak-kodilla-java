package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numOfPosts;

    public ForumUser(final int userID, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numOfPosts = numOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numOfPosts=" + numOfPosts +
                '}';
    }
}
