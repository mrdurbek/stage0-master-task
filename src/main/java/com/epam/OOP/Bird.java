package com.epam.OOP;

public class Bird extends Animal{
	
	private String color = "blue";
	private int numberOfPaws = 2;
	private boolean hasFur = false; 
	
	public Bird() {
		super.setColor(color);
		super.setNumberOfPaws(numberOfPaws);
		super.setHasFur(hasFur);
	}

	public Bird(String color, int numberOfPaws, boolean hasFur) {
		super(color, numberOfPaws, hasFur);
	}

	@Override
	public String getDescription() {
		super.getDescription();
		System.out.println(" Moreover, it has 2 wings and can fly.");
		return super.getDescription()+" Moreover, it has 2 wings and can fly.";
	}
	
	
	
}

