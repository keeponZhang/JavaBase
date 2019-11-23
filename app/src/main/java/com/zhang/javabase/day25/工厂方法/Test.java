package com.zhang.javabase.day25.工厂方法;

import com.zhang.javabase.bean.Dog;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DogFactory df = new DogFactory();
		Dog d = (Dog) df.createAnimal();
		d.eat();
	}

}
