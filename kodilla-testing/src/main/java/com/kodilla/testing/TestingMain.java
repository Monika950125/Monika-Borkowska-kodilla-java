package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(15,8);
        int calculation1 = calculator.subtract();

        if(calculation1 == calculator.getA() - calculator.getB()) {
            System.out.println("Subtraction test OK");
        }else {
            System.out.println("Subtraction error");
        }

        int calculation2 = calculator.add();

        if(calculation2 == calculator.getA() + calculator.getB()) {
            System.out.println("Addition test OK");
        }else {
            System.out.println("Addition error");
        }
    }
}
