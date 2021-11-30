package com.springcore.lifecycle;

public class Samosha {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Samosha() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosha [price=" + price + "]";
}

public void init() {
	System.out.println("Taking samosha ");
}

public void destroy() {
	System.out.println("Samosha destroy ");
}

}


