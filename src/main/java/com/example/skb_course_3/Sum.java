package com.example.skb_course_3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component
public class Sum implements MathAction {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    @PostConstruct
    public void init() {
        System.out.println("Sum bean created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Sum bean destroyed");
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResult() {
        return a + b;
    }
}
