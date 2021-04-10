package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double total = calculator.add(4.1, 3.5);
        double difference = calculator.sub(5.9, 3);
        double product = calculator.mul(5.4, 8.2);
        double quotient = calculator.div(78, 15);

        //Then
        Assertions.assertEquals(7.6, total, 0.01);
        Assertions.assertEquals(2.9, difference, 0.01);
        Assertions.assertEquals(44.28, product, 0.01);
        Assertions.assertEquals(5.2, quotient, 0.01);

    }


}
