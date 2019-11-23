package com.zhang.javabase.day25.简单工厂;

import com.zhang.javabase.bean.Cat;
import com.zhang.javabase.bean.Dog;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Dog d = AnimalFactory.createDog();
		
		Dog d = (Dog) AnimalFactory.createAnimal("dog");
		d.eat();
		
		Cat c = (Cat) AnimalFactory.createAnimal("cat");
		c.eat();
	}

}
