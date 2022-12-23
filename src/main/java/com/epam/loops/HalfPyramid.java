package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
    	
    	for(int i = 1; i<=cathetusLength; i++) {
    		
    		String space = "";
    		
    		for(int numberOfSpace = i ; numberOfSpace < cathetusLength; numberOfSpace++ ) {
    			space += " ";
    		}
    		
    		System.out.print(space);
    		
    		for(int j = 1; j<=i; j++) {
        		System.out.print("*");
        	}
    		System.out.println();
    	}
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
