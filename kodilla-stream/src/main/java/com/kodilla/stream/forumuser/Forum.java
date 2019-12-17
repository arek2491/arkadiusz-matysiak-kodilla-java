package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(0, "John66", 'M', 2010, 8, 21, 17));
        userList.add(new ForumUser(1, "Marrie33", 'F', 1991, 9, 11, 19));
        userList.add(new ForumUser(2, "Valentine666", 'M', 2007, 10, 12, 0));
        userList.add(new ForumUser(3, "Martin00", 'M', 1989, 11, 29, 11));
        userList.add(new ForumUser(4, "Deborah39", 'F', 1976, 12, 12, 9));
        userList.add(new ForumUser(5, "Samanta29", 'F', 1999, 1, 1, 1));
        userList.add(new ForumUser(6, "Bill44", 'M', 1991, 2, 8, 4));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }

}
