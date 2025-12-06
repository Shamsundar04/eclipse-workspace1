package com.sham.hasarelationship;

public class Engine {
	
	private String type;
	private int horsePower;
	
	public Engine(String type, int horsePower) {
		super();
		this.type = type;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [model=" + type + ", horsePower=" + horsePower + "]";
	}
}
