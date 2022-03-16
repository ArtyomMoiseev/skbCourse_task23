package com.example.skb_course_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean()
    public ArrayListMathWorker getArrayListMathWorker(MathAction multiplication) {
        var worker = new ArrayListMathWorker();
        worker.setAction(multiplication);
        return worker;
    }

}
