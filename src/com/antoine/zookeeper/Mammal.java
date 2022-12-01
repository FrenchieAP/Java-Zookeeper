package com.antoine.zookeeper;

public class Mammal {
	// MEMBER VARIABLES
	protected int energyLevel;
	// CONSTRUCTORS
	public Mammal() {
		this.energyLevel = 100;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	// GETTERS / SETTERS / ETC
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}