package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User seba = new Millennials("Seba");
        User natka = new YGeneration("Natka");
        User domi = new ZGeneration("Domi");

        //When
        String sebaSocialNetwork = seba.sharePost();
        System.out.println("Seba share posts on " + sebaSocialNetwork);
        String natkaSocialNetwork = natka.sharePost();
        System.out.println("Natka share posts on " + natkaSocialNetwork);
        String domiSocialNetwork = domi.sharePost();
        System.out.println("Domi share posts on " + domiSocialNetwork);

        //Then
        Assertions.assertEquals("Facebook", sebaSocialNetwork);
        Assertions.assertEquals("Twitter", natkaSocialNetwork);
        Assertions.assertEquals("Snapchat", domiSocialNetwork);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User aga = new Millennials("Aga");

        //When
        String agaSocialNetwork = aga.sharePost();
        System.out.println("Aga share posts on " + agaSocialNetwork);
        aga.setSocialNetwork(new SnapchatPublisher());
        agaSocialNetwork = aga.sharePost();
        System.out.println("Now Aga share posts on " + agaSocialNetwork);

        //Then
        Assertions.assertEquals("Snapchat", agaSocialNetwork);
    }
}
