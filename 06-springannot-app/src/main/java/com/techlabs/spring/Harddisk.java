package com.techlabs.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Harddisk {

	@Value("10")
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
