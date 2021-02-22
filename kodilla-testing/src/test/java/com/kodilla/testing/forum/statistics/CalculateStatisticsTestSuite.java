package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<ForumUser> generateListOfNUsers(int usersQuantity) {
        List<ForumUser> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            ForumUser theForumUser = new ForumUser("Name " + n, "realName " + n);
            resultList.add(theForumUser);
        }
        return resultList;
    }

    private List<ForumPost> generateListOfNPosts(int postsQuantity) {
        List<ForumPost> resultPostList = new ArrayList<>();
        for (int n = 1; n <= postsQuantity; n++) {
            ForumPost thePost = new ForumPost("Hello!" + n, "realName " + n);
            resultPostList.add(thePost);
        }
        return resultPostList;
    }

    private List<ForumComment> generateListOfNComments(int commentsQuantity) {
        List<ForumComment> resultCommentList = new LinkedList<>();
        for (int n = 1; n <= commentsQuantity; n++) {
            ForumPost thePost = new ForumPost("Hello!" + n, "realName " + n);
            ForumComment theComment = new ForumComment(thePost, "realName " + n, "Comment" + n);
            resultCommentList.add(theComment);
        }
        return resultCommentList;
    }


    @Test
    void testCalculateAdvStatisticsIfCountOfUsers0() {

        //Given
        List<ForumUser> resultForumUserList = generateListOfNUsers(0);
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics(statisticsMock);

        //When
        List<String> usersNames = calculatorOfStatistics.usersNames(resultForumUserList);
        int size = usersNames.size();

        //Then
        Assertions.assertEquals(0, size);
    }

    @Test
    void TestCalculateAdvStatisticsIfCountOfUsers100() {

        //Given
        List<ForumUser> resultForumUserList = generateListOfNUsers(100);
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics(statisticsMock);

        //When
        List<String> usersNames = calculatorOfStatistics.usersNames(resultForumUserList);
        int size = usersNames.size();

        //Then
        Assertions.assertEquals(100, size);
    }

    @Test
    void testIfPostsCount1000() {

        //Given
        List<ForumPost> resultForumPostsList = generateListOfNPosts(1000);
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics(statisticsMock);

        //When
        int postsCount = calculatorOfStatistics.postsCount(resultForumPostsList);

        //Then
        Assertions.assertEquals(1000, postsCount);
    }

    @Test
    void testIfPostsCount0() {

        //Given
        List<ForumPost> resultForumPostsList = generateListOfNPosts(0);
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics(statisticsMock);

        //When
        int postsCount = calculatorOfStatistics.postsCount(resultForumPostsList);

        //Then
        Assertions.assertEquals(0, postsCount);
    }

    @Test
    void testIfCommentsCount0() {

        //Given
        List<ForumComment> resultForumCommentList = generateListOfNComments(0);
        CalculateStatistics calculatorOfStatistics = new CalculateStatistics(statisticsMock);

        //When
        int commentsCount = calculatorOfStatistics.commentsCount(resultForumCommentList);

        //Then
        Assertions.assertEquals(0, commentsCount);
    }
}
