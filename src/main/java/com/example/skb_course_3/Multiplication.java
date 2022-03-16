package com.example.skb_course_3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Multiplication implements MathAction {

    private int a;
    private int b;

    @PostConstruct
    public void init() {
        System.out.println("Multiplication bean created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Multiplication bean destroyed");
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResult() {
        return a * b;
    }
}
