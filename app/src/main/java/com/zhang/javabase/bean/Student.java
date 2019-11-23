package com.zhang.javabase.bean;

public class Student extends Person implements Comparable<Student> {
	public Student(){}

	public Student(String name,int age) {
		super(name,age);
	}

	public void method() {
		print();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.getAge())
			return false;
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!name.equals(other.getName()))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		int num = this.age - o.age;					//以年龄为主要条件
		return num == 0 ? this.name.compareTo(o.name) : num;
	}
}
