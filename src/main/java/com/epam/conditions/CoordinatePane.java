package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
    	if(x==0 && y==0) {
    		System.out.println("zero");
    	}
    	else if(x == 0 && y != 0) {
    		System.out.println("On the y axis");
    	}
    	else if(x != 0 && y==0) {
    		System.out.println("On the x axis");
    	}
    	else if(x > 0 && y>0) {
    		System.out.println("first");
    	}
    	else if(x < 0 && y>0) {
    		System.out.println("second");
    	}
    	else if(x > 0 && y < 0) {
    		System.out.println("fourth");
    	}
    	else System.out.println("third");
    }

}

