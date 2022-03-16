package com.example.skb_course_3;

import java.util.ArrayList;

public class ArrayListMathWorker {

    private MathAction action;

    public void setAction(MathAction action) {
        this.action = action;
    }

    public int result(ArrayList<Integer> arr) {
        var result = 0;
        for(var i = 0; i < arr.size() - 1; i++) {
            action.setA(arr.get(i));
            action.setB(arr.get(i + 1));
            result += action.getResult();
        }
        return result;
    }
}
