package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text!"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator:: subBFromA);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("castle", String::toUpperCase);
        poemBeautifier.beautify("FLOWER", (text) -> text.toLowerCase());
        poemBeautifier.beautify("castle", (text) -> "sand " + text);
        poemBeautifier.beautify("castle", (text) -> text.substring(0, 4));
        poemBeautifier.beautify("castle", (text) -> text.replace("a","A"));

    }
}
