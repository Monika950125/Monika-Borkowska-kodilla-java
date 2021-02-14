package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")

public class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
    )

    @Test
    void testCaseUsername(){

        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jan Kowalski");
        String expectedResult = "theForumUser";

        //When
        String result = simpleUser.getUsername();


        //Then
        Assertions.assertEquals(expectedResult, result);
    }


    @DisplayName(
            "When created SimpleUser with realName, " +
                    "then getUsername should return real user name"
    )
    @Test
    void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jan Kowalski");

        //When
        String result = simpleUser.getRealName();

        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals("Jan Kowalski", result);
    }
}
