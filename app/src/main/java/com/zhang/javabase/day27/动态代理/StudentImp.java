package com.zhang.javabase.day27.动态代理;

import com.zhang.javabase.interfaces.IStudent;

public class StudentImp implements IStudent {

	@Override
	public void login() {
		System.out.println("登录");
	}

	@Override
	public void submit() {
		System.out.println("提交");
	}

}
