package com.techlabs.spring;

public class Computer {

	private String name;
	private Harddisk harddisk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Harddisk getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}

	public Computer(String name, Harddisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}
	
	public Computer() {}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", harddisk=" + harddisk + "]";
	}

}
