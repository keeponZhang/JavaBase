package com.zhang.javabase.bean;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void sleep() {
		System.out.println("猫睡觉");
	}
}