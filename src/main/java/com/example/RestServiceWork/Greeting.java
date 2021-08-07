package com.example.RestServiceWork;

public class Greeting {

	private final long id;
	private final String name;
	
	public Greeting(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", name=" + name + "]";
	}
	
	
}

