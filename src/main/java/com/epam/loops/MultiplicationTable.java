package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
    	if(numberTableToPrint<=0) {
    		System.out.println("Input a positive integer!");
    	}
    	else {
    		for(int i = 1; i<=10; i++) {
    			System.out.println( i+ " x "+ numberTableToPrint + " = "+numberTableToPrint*i );
    		}
    	}
    }

}
