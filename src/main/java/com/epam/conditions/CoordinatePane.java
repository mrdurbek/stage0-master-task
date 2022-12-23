package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
    	if(x==0 && y==0) {
    		System.out.println("Zero");
    	}
    	else if(x == 0 && y != 0) {
    		System.out.println("On the y axis");
    	}
    	else if(x != 0 && y==0) {
    		System.out.println("On the x axis");
    	}
    	else if(x > 0 && y>0) {
    		System.out.println("First");
    	}
    	else if(x < 0 && y>0) {
    		System.out.println("Second");
    	}
    	else if(x > 0 && y < 0) {
    		System.out.println("Fourth");
    	}
    	else System.out.println("Third");
    }

}

