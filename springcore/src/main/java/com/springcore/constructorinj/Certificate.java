package com.springcore.constructorinj;

public class Certificate {
	String name;
	
	Certificate(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}

}
