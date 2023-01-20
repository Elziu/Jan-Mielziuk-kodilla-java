package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.sql.SQLOutput;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator1 = new Calculator(2, 2);
        Calculator calculator2 = new Calculator(4, 4);

        int result1 = calculator1.add();
        int result2 = calculator2.subtract();

        if (result1 == calculator1.getA() + calculator1.getB()){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (result2 == calculator2.getA() - calculator2.getB()){
            System.out.println("test OK");
        }  else {
            System.out.println("Error!");
        }



    }

}
