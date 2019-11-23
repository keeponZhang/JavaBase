package com.zhang.javabase.day10.inner.nimingneibulei;

class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//如何调用PersonDemo中的method方法呢?
		PersonDemo pd = new PersonDemo ();
		//pd.method(new IStudent());
		pd.method(new Person() {
			public void show() {
				System.out.println("show");
			}
		});
	}

	//这里写抽象类，接口都行
	static  abstract class Person {
		public abstract void show();
	}

	static class PersonDemo {

		//public void method(Person p) {		//Person p = new IStudent();		//父类引用指向子类对象
	/*
	Person p = new Person(){
		public void show() {
			System.out.println("show");
		}
	};
	*/
		public void method(Person p) {
			p.show();
		}
	}

	class Student extends Person {
		public void show() {
			System.out.println("show");
		}

	}
}