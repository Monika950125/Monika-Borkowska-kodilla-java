package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CalculateStatistics {

    private List<ForumUser> forumUsers = new ArrayList<>();
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();
    private int postsCount;
    private int commentsCount;
    private double averageOfPosts;
    private double averageOfComment;
    private double averageOfCommentPerPost;
    private Statistics calculatorOfStatistics;


    public CalculateStatistics(Statistics calculatorOfStatistics) {
        this.calculatorOfStatistics = calculatorOfStatistics;
    }

    public Statistics getCalculatorOfStatistics() {
        return calculatorOfStatistics;
    }

    public List<String> usersNames(List<ForumUser> forumUsers) {
        List<String> usersNames = new ArrayList<>();
        for (ForumUser forumUser : forumUsers) {
            usersNames.add(forumUser.getRealName());
        }
        return usersNames;
    }

    public int postsCount(List<ForumPost> posts) {
        for (int i = 0; i == forumUsers.size(); i++) {
            int size = posts.size();
            int thisUserPostsCount = size;
            postsCount = postsCount + thisUserPostsCount;
        }
        return postsCount;
    }

    public int commentsCount(List<ForumComment> comments) {

        for (int n = 0; n == forumUsers.size(); n++) {
            int size = comments.size();
            int thisUserCommentsCount = size;
            commentsCount = commentsCount + thisUserCommentsCount;
        }
        return commentsCount;
    }

    public double averageOfPostPerUser() {

        averageOfPosts = postsCount(posts) / forumUsers.size();
        return averageOfPosts;
    }

    public double averageOfCommentPerUser() {

        averageOfComment = commentsCount(comments) / forumUsers.size();
        return averageOfComment;
    }


    public double averageOfCommentPerPost() {

        averageOfCommentPerPost = commentsCount(comments) / postsCount(posts);
        return averageOfCommentPerPost;
    }

    public void calculateAdvStatistics() {

        List<String> usersNames = usersNames(forumUsers);
        postsCount = postsCount(posts);
        commentsCount = commentsCount(comments);
        averageOfPosts = averageOfPostPerUser();
        averageOfComment = averageOfCommentPerUser();
        averageOfCommentPerPost = averageOfCommentPerPost();
    }

}
