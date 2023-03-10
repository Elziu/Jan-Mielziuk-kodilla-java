package com.kodilla.testing.forum.statistics;


import com.kodilla.testing.forum.tdd.statistic.AdvStatistics;
import com.kodilla.testing.forum.tdd.statistic.Statistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(){
        List<String> forumUsers = new ArrayList<>();
        for (int n = 1; n <= 100; n++){
            String forumUser = "User " + n;
            forumUsers.add(forumUser);
        }
        return forumUsers;
    }

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEachTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for average posts number per user")
    class postsPerUserTests {

        @Test
        @DisplayName("0 posts and 0 users")
        void testCalculateAveragePostsNumberPerUserFor0PostsAnd0Users(){
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> forumUsers = new ArrayList<>();
            int posts = 0;
            when(statisticsMock.usersNames()).thenReturn(forumUsers);
            when(statisticsMock.postsCount()).thenReturn(posts);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(Double.NaN,advStatistics.getAveragePostsNumberPerUser());
        }
        @Test
        @DisplayName("0 posts and 100 users")
        void testCalculateAveragePostsNumberPerUserFor0PostsAnd100Users(){
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> forumUsers = generateListOfNUsers();
            int posts = 0;
            when(statisticsMock.usersNames()).thenReturn(forumUsers);
            when(statisticsMock.postsCount()).thenReturn(posts);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0,advStatistics.getAveragePostsNumberPerUser());
        }
        @Test
        @DisplayName("1000 posts and 0 users")
        void testCalculateAveragePostsNumberPerUserFor1000PostsAnd0Users(){
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> forumUsers = new ArrayList<>();
            int posts = 1000;
            when(statisticsMock.usersNames()).thenReturn(forumUsers);
            when(statisticsMock.postsCount()).thenReturn(posts);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(Double.POSITIVE_INFINITY,advStatistics.getAveragePostsNumberPerUser());
        }
        @Test
        @DisplayName("1000 posts and 100 users")
        void testCalculateAveragePostsNumberPerUserFor100PostsAnd0Users(){
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> forumUsers = generateListOfNUsers();
            int posts = 1000;
            when(statisticsMock.usersNames()).thenReturn(forumUsers);
            when(statisticsMock.postsCount()).thenReturn(posts);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(10,advStatistics.getAveragePostsNumberPerUser());
        }

    }

    @Nested
    @DisplayName("Tests for average comments number per user")
    class commentsPerUserTests {

        @Test
        @DisplayName("0 comments and 0 users")
        void testCalculateAverageCommentsNumberPerUserFor0CommentsAnd0Users(){
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> forumUsers = new ArrayList<>();
            int comments = 0;
            when(statisticsMock.usersNames()).thenReturn(forumUsers);
            when(statisticsMock.commentsCount()).thenReturn(comments);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(Double.NaN,advStatistics.getAverageCommentsNumberPerUser());
        }
        @Test
        @DisplayName("0 comments and 100 users")
        void testCalculateAverageCommentsNumberPerUserFor0CommentsAnd100Users(){
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            List<String> forumUsers = generateListOfNUsers();
            int comments = 0;
            when(statisticsMock.usersNames()).thenReturn(forumUsers);
            when(statisticsMock.commentsCount()).thenReturn(comments);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(0,advStatistics.getAverageCommentsNumberPerUser());
        }
    }

    @Nested
    @DisplayName("Tests for average comments number per post")
    class commentsPerPostTests {

        @Test
        @DisplayName("Number of comments less than number of posts")
        void testCalculateAverageCommentsNumberPerPostCommentsLessThanPosts() {
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            int posts = 15;
            int comments = 7;
            when(statisticsMock.postsCount()).thenReturn(posts);
            when(statisticsMock.commentsCount()).thenReturn(comments);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals((double) 7 / 15, advStatistics.getAverageCommentsNumberPerPost());
        }

        @Test
        @DisplayName("Number of comments more than number of posts")
        void testCalculateAverageCommentsNumberPerPostCommentsMoreThanPosts() {
            //Given
            AdvStatistics advStatistics = new AdvStatistics();
            int posts = 7;
            int comments = 15;
            when(statisticsMock.postsCount()).thenReturn(posts);
            when(statisticsMock.commentsCount()).thenReturn(comments);

            //When
            advStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals((double) 15 / 7, advStatistics.getAverageCommentsNumberPerPost());
        }
    }


}