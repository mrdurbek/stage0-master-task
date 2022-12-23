package com.epam.OOP;

public class Animal {
	private String color;
	private int numberOfPaws;
	private boolean hasFur;
	
	public Animal() {}
	
	public Animal(String color, int numberOfPaws, boolean hasFur) {
		super();
		this.color = color;
		this.numberOfPaws = numberOfPaws;
		this.hasFur = hasFur;
	}
	
	public void getDescription() {
		
		String description = "This animal is mostly "+ this.color+". It has "+this.numberOfPaws;
		if(this.hasFur && this.numberOfPaws>1) {
			description += " paws and a fur.";
		}
		else if(this.hasFur && this.numberOfPaws==1) {
			description += " paw and a fur.";
		}
		else if(!this.hasFur && this.numberOfPaws==1) {
			description += " paw and no fur.";
		}
		else description += " paws and no fur.";
		
		System.out.print(description);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfPaws() {
		return numberOfPaws;
	}

	public void setNumberOfPaws(int numberOfPaws) {
		this.numberOfPaws = numberOfPaws;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	
}

