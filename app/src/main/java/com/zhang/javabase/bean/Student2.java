package com.zhang.javabase.bean;

public class Student2 {
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;
	
	public Student2() {
		super();
		
	}
	public Student2(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum = this.chinese + this.math + this.english;
	}
	public int getSum() {
		return sum;
	}
	
	public String toString() {
		return name + "," + chinese + "," + math + "," + english + "," + sum;
	}
	
}