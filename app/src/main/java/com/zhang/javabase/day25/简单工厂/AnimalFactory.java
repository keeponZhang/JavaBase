package com.zhang.javabase.day25.简单工厂;

import com.zhang.javabase.bean.Animal;
import com.zhang.javabase.bean.Cat;
import com.zhang.javabase.bean.Dog;

public class AnimalFactory {
	/*public static Dog createDog() {
		return new Dog();
	}
	
	public static Cat createCat() {
		return new Cat();
	}*/
	
	//发现方法会定义很多,复用性太差
	//改进
	public static Animal createAnimal(String name) {
		if("dog".equals(name)) {
			return new Dog();
		}else if("cat".equals(name)) {
			return new Cat();
		}else {
			return null;
		}
	}
}
