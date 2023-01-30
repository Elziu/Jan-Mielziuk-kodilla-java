package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;



public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("7.1 Beautify texts.");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Abecadlo", text -> "xXx" + text + "xXx");
        poemBeautifier.beautify("Abecadlo" , text -> text.toUpperCase());
        poemBeautifier.beautify("ABECADLO" , text -> text.toLowerCase());
        poemBeautifier.beautify("ABECADLO" , text -> text + " :)");
        poemBeautifier.beautify("A B E C A D L O" , text -> text.trim());
        poemBeautifier.beautify("ABECADLO" , text -> text.substring(2,5));






    }
}
