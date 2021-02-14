package com.kodilla.testing.collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.*;



public class CollectionTestSuite {

    List<Integer> numbers = new ArrayList<Integer>();
    List <Integer> evenNumbers = new ArrayList<>();


    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end\n");
    }

    @DisplayName("When ArrayList numbers is empty," +
            "Then ArrayList evenNumber should be empty too")

    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();


        //When
        ext.exterminate(numbers, evenNumbers);
        int result = evenNumbers.size();

        //Then
        Assertions.assertEquals(0, result);


    }


    @DisplayName("When ArrayList numbers contain odd and even numbers," +
            "Then ArrayList evenNumber should be contain only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();

        //When
        ext.completeList(numbers);
        ext.exterminate(numbers, evenNumbers);
        int result = evenNumbers.size();
        int modulo = 0;
        for(Integer element: evenNumbers){
            modulo = element % 2;
        }

        //Then
        Assertions.assertEquals(50, result);
        Assertions.assertEquals(0, modulo);


    }
}
