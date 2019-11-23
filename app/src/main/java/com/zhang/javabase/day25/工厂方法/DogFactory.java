package com.zhang.javabase.day25.工厂方法;

import com.zhang.javabase.bean.Animal;
import com.zhang.javabase.bean.Dog;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {

		return new Dog();
	}

}
