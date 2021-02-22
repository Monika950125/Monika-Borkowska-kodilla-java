package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


@DisplayName("TDD: ShapeCollector Test Suite")

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests")
    class TestShapeCollector {


        @Test
        void testAddShape() {

            //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(circle);
            int collectorSize = shapeCollector.getSize();

            //Then
            Assertions.assertEquals(1, collectorSize);

        }

        @Test
        void testRemoveFigureNoExisting() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(null);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigure() {

            //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(circle);
            boolean result = shapeCollector.removeFigure(circle);
            int collectorSize = shapeCollector.getSize();

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, collectorSize);
        }

        @Test
        void testGetFigureNoExisting() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            // When
            Shape theShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertNull(theShape);

        }

        @Test
        void testGetFigure() {

            //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);

            //When

            Shape theShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, theShape);

        }

        @Test
        void testShowFigures() {

            //Given
            Shape circle = new Circle();
            Shape circle2 = new Circle();
            Shape triangle = new Triangle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle2);
            shapeCollector.addFigure(triangle);

            //When
            String theShapeName = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("circlecircletriangle", theShapeName);


        }
    }

}






