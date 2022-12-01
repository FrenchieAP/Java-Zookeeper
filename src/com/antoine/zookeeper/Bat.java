package com.antoine.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}

	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Sfwoosh!");
		this.displayEnergy();
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Mmm...humans...crunch!");
		this.displayEnergy();
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("Attack! Attack! Attack! Attack! Attack!");
		this.displayEnergy();
	}

}


