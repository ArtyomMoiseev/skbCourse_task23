package com.example.skb_course_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Multiplication multiplication;
    @Autowired
    private Sum sum;


    public int calculate(String expression) {
        var parsedString = expression.split(" ");
        var a = Integer.parseInt(parsedString[0]);
        var b = Integer.parseInt(parsedString[2]);

        switch (parsedString[1]) {
            case ("+"):
                sum.setA(a);
                sum.setB(b);
                return sum.getResult();
            case ("*"):
                multiplication.setA(a);
                multiplication.setB(b);
                return sum.getResult();
        }

        throw new IllegalArgumentException();
    }
}
