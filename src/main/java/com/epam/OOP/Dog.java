package com.epam.OOP;

public class Dog extends Animal{
	
	private String color = "brown";
	private int numberOfPaws = 4;
	private boolean hasFur = true; 
	
	public Dog() {
		super.setColor(color);
		super.setNumberOfPaws(numberOfPaws);
		super.setHasFur(hasFur);
	}
	
	public Dog(String color, int numberOfPaws, boolean hasFur) {
		super(color, numberOfPaws, hasFur);
	}

	@Override
	public String getDescription() {
		return super.getDescription();
	}
	
	
}

