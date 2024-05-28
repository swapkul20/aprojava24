package com.techlabs.spring;

public class Harddisk {

	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Harddisk(int capacity) {
		super();
		this.capacity = capacity;
	}
	
	public Harddisk() {
		capacity=0;
	}

	@Override
	public String toString() {
		return "Harddisk [capacity=" + capacity + "]";
	}

}
