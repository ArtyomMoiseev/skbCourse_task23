package com.example.skb_course_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class SkbCourse3Application {

    public static void main(String[] args) {
        var context = SpringApplication.run(SkbCourse3Application.class, args);

        // Calculator class with field DI
        Calculator calc = context.getBean(Calculator.class);
        System.out.println(calc.calculate("1 + 2"));

        // Adder class with constructor DI
        Adder adder = context.getBean(Adder.class);
        adder.addSum(5);
        adder.addMulti(2);
        System.out.println(adder.result());

        // ArrayListMathWorker class with setter DI
        var ArrayListMathWorker = context.getBean(ArrayListMathWorker.class);
        var arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        System.out.println(ArrayListMathWorker.result(arr));

    }

}
