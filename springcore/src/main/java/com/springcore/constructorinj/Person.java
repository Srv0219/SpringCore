package com.springcore.constructorinj;

import java.util.List;

public class Person {
private String name;
private int personid;
private Certificate certificate;
private List<String> list;

public Person(String name, int personid,Certificate certificate , List<String> list) {
	
	this.name = name;
	this.personid = personid;
	this.certificate=certificate;
	this.list=list;
}

@Override
public String toString() {
	return this.name+" : "+this.personid+" : "+this.certificate.name+" : "+this.list;
}


}
