package com.kodilla.testing.forum.tdd.statistic;


import java.util.List;

public class AdvStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsNumberPerUser;
    private double averageCommentsNumberPerUser;
    private double averageCommentsNumberPerPost;



    public void calculateAdvStatistics(Statistics statistics) {

        List<String> forumUsers = statistics.usersNames();
        usersNumber = forumUsers.size();

        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber == 0 && postsNumber == 0) {
            averagePostsNumberPerUser = Double.NaN;
        } else if (usersNumber == 0 && postsNumber > 0) {
            averagePostsNumberPerUser = Double.POSITIVE_INFINITY;
        } else {
            averagePostsNumberPerUser = (double) postsNumber / usersNumber;
        }


        if (usersNumber == 0 && commentsNumber == 0) {
            averageCommentsNumberPerUser = Double.NaN;
        } else if (usersNumber == 0 && commentsNumber > 0) {
            averageCommentsNumberPerUser = Double.POSITIVE_INFINITY;
        } else {
            averageCommentsNumberPerUser = (double) commentsNumber / usersNumber;
        }


        if (postsNumber == 0 && commentsNumber == 0) {
            averageCommentsNumberPerPost = Double.NaN;
        } else if (postsNumber == 0 && commentsNumber > 0) {
            averageCommentsNumberPerPost = Double.POSITIVE_INFINITY;
        } else {
            averageCommentsNumberPerPost = (double) commentsNumber / postsNumber;
        }
    }

    @Override
    public String toString() {
        return "AdvStatistics{" +
                "usersNumber=" + usersNumber +
                ", postsNumber=" + postsNumber +
                ", commentsNumber=" + commentsNumber +
                ", averagePostsNumberPerUser=" + averagePostsNumberPerUser +
                ", averageCommentsNumberPerUser=" + averageCommentsNumberPerUser +
                ", averageCommentsNumberPerPost=" + averageCommentsNumberPerPost +
                '}';
    }

    public double getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public double getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public double getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }
}
