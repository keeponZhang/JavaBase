package com.zhang.javabase.day25.工厂方法;

import com.zhang.javabase.bean.Animal;
import com.zhang.javabase.bean.Cat;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {

		return new Cat();
	}

}
