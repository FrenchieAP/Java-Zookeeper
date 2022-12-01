package com.antoine.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}

	public void throwStuff() {
		this.energyLevel -= 5;
		System.out.println("The Gorilla threw stuff!");
		this.displayEnergy();
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The Gorilla ate some bananas. Mmmm...");
		this.displayEnergy();
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The Gorilla is climbin' up a tree!");
		this.displayEnergy();
	}

}
