package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
    	first = first ^ second;
    	second = first ^ second;
    	first = second ^ first;
    	System.out.println("After swap: first = " + first + ", second= " + second);
    }

}
