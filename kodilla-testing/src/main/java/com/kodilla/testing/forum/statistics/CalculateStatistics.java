package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {

    private Statistics statistics;

    private double averageOfCommentsPerUSer;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    List<String> usersNames() {
        List<String> userNames = statistics.usersNames();
        return userNames;
    }

    int postsCount() {
        int postsCount = statistics.postsCount();

        return postsCount;
    }

    int commentsCount() {
        int commentsCount = statistics.commentsCount();

        return commentsCount;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        double size = statistics.usersNames().size();
        double postsCount = statistics.postsCount();
        double commentsCount = statistics.commentsCount();

        if (size == 0 && postsCount == 0) {
            averageOfCommentsPerPost = 0.0;
            averageOfPostsPerUser = 0.0;
            averageOfCommentsPerUSer = 0.0;
        }else if(size > 0 && postsCount == 0){
            averageOfCommentsPerUSer = commentsCount / size;
            averageOfPostsPerUser = postsCount / size;
            averageOfCommentsPerPost = 0;
        }else if(size == 0 && postsCount > 0){
            averageOfCommentsPerPost = commentsCount / postsCount;
            averageOfPostsPerUser = 0.0;
            averageOfCommentsPerUSer = 0.0;
        }else if(size > 0 && postsCount > 0){
            averageOfCommentsPerUSer = commentsCount / size;
            averageOfPostsPerUser = postsCount / size;
            averageOfCommentsPerPost = commentsCount / postsCount;
        }
    }

    public double getAverageOfCommentsPerUSer() {
        return averageOfCommentsPerUSer;
    }

    public double getAverageOfCommentsPerPost() {
        return averageOfCommentsPerPost;
    }

    public double getAverageOfPostsPerUser() {
        return averageOfPostsPerUser;
    }
}
