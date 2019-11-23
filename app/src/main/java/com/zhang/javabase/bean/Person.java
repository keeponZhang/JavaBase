package com.zhang.javabase.bean;

import java.io.Serializable;

public class Person  implements Serializable {
	private static final long serialVersionUID = 2L;

	protected String name;
	protected int age;

	public Person(){}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	protected void print() {
		System.out.println("print");
	}
}
