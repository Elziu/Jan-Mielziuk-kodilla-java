package com.kodilla.testing.shape;

import org.junit.*;
import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.Test;


import java.util.*;

@DisplayName(
        "TDD: Shape Collector Test Suite"
)

public class ShapeCollectorTestSuite {



    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests were finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("This is the " + testCounter + " test");
    }

    @Nested
    @DisplayName(
            "Add and remove figure tests."
    )
    class AddingAndRemoving{

        @Test
        public void testAddFigure() {

            //Given
            ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                    new Circle(15),
                    new Triangle(20, 13))));
            ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                    new Circle(15),
                    new Triangle(20, 13),
                    new Square(15))));
            int expectedListSize = expectedList.getShapeList().size();

            //When
            testList.addFigure(new Square(12));
            int actualListSize = testList.getShapeList().size();

            //Then
            Assert.assertEquals(expectedListSize, actualListSize);
        }

        @Test
        public void testRemoveFigure() {

            //Given
            Circle circle = new Circle(15);
            Triangle triangle = new Triangle(15, 20);
            Square square = new Square(34);

            ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                    circle, triangle, square)));

            ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                    circle, triangle)));

            int expectedListSize = expectedList.getShapeList().size();

            //When
            testList.removeFigure(square);
            int actualListSize = testList.getShapeList().size();

            //Then
            Assert.assertEquals(expectedListSize, actualListSize);

        }

    }

    @Nested
    @DisplayName(
            "Get and show figure tests."
    )
    class GettingAndShowingFigure{

        @Test
        public void testGetFigure() {
            //Given
            Circle circle = new Circle(15);
            Triangle triangle = new Triangle(15, 20);
            Square square = new Square(34);

            ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                    circle, triangle, square)));

            //When
            Shape shape1=testList.getFigure(1);
            Shape shape2=testList.getFigure(-1);
            Shape shape3=testList.getFigure(3);


            //Then
            Assert.assertEquals(triangle, shape1);
            Assert.assertEquals(null, shape2);
            Assert.assertEquals(null, shape3);
        }
        @Test
        public void testShowFigures() {
            //Given
            Circle circle = new Circle(13);
            Triangle triangle = new Triangle(16, 16);
            Square square = new Square(20);
            ArrayList<Shape> testList=new ArrayList<Shape>(Arrays.asList(
                    circle, triangle, square));


            //When
            ShapeCollector shapesCollection = new ShapeCollector(testList);



            //Then
            Assert.assertEquals(testList,shapesCollection.showFigures());
        }

    }


}
