package com.kodilla.patterns.strategy.social;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User becky = new YGeneration("Becky");
        User karen = new ZGeneration("Karen");

        //When
        String johnShouldPublish = john.sharePost();
        String beckyShouldPublish = becky.sharePost();
        String karenShouldPublish = karen.sharePost();

        //Then
        Assert.assertEquals("Opublikowano post na Facebook-u", johnShouldPublish);
        Assert.assertEquals("Twitter - dodano tweet", beckyShouldPublish);
        Assert.assertEquals("Snapchat - poszło", karenShouldPublish);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User karen = new ZGeneration("Karen");

        //When
        String karenShouldPublish = karen.sharePost();

        karen.setSocialPublisher(new TwitterPublisher());
        karenShouldPublish = karen.sharePost();

        //Then
        Assert.assertEquals("Twitter - dodano tweet", karenShouldPublish);
    }

}