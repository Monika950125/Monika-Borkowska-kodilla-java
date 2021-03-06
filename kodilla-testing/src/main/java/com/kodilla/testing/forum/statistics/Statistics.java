package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

import java.util.List;

public interface Statistics {

    List<String> usersNames();

    int postsCount();

    int commentsCount();
}
