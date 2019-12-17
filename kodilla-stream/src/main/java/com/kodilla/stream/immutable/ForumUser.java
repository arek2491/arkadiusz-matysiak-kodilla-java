package com.kodilla.stream.immutable;

public final class ForumUser {

    private final String userName;
    private final String realName;

    public ForumUser(final String userName, final String realname) {

        this.userName = userName;
        this.realName = realname;

    }

    public String getUserName(){
        return userName;
    }
    public String getRealName(){
        return realName;
    }
}
