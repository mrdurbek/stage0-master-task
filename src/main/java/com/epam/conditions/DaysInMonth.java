package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
    	
    	if(year == 1900 && month==2) {
    		System.out.println(28);
    	}
    	
    	else if(year%4==0 && month==2) {
    		System.out.println(29);
    	}
    	else {
    		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12: System.out.println(31); break;
			case 4, 6, 9, 11: System.out.println(30); break;
			case 2: System.out.println(28); break;
			default:
				System.out.println("invalid date");
			}
    	}
    }

}
