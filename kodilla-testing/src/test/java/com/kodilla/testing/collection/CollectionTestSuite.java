package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;
import org.junit.jupiter.api.*;



public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }
    @DisplayName(
            "Does class work when list is empty."
    )
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        List<Integer> emptyList = new ArrayList<Integer>();

        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing" + listNumbers);

        //Then
        Assertions.assertEquals(emptyList,listNumbers);
    }
    @DisplayName(
            "Does class work when list contains odds and evens."
    )
    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(364,555,15,400,23,74,23,3,20));
        List<Integer> oddList = new ArrayList<Integer>(Arrays.asList(364,400,74,20));

        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);

        //Then
        Assertions.assertEquals(oddList,listNumbers);
    }
}