package com.example.skb_course_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Adder {

    private MathAction multiplication;
    private MathAction sum;
    private int number = 0;

    @Autowired
    public Adder(MathAction multiplication, MathAction sum) {
        this.multiplication = multiplication;
        this.sum = sum;
    }

    public void addMulti(int num) {
        multiplication.setA(number);
        multiplication.setB(num);
        number = multiplication.getResult();
    }

    public void addSum(int num) {
        sum.setA(number);
        sum.setB(num);
        number = sum.getResult();
    }

    public int result() {
        return number;
    }


}
