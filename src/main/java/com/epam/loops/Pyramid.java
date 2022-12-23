package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
    	
    	for(int i = 1; i<=cathetusLength; i++) {
    		
    		String space = "";
    		
    		for(int numberOfSpace = i ; numberOfSpace < cathetusLength; numberOfSpace++ ) {
    			space += " ";
    		}
    		
    		int n = i;
    		for(int k = 1; k < n; n-- ) {
				space+=n;
			} 
    		
    		System.out.print(space);
    		
    		for(int j = 1; j<=i; j++) {
        		System.out.print(j);
        	}
    		System.out.println();
    	}
    	
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
