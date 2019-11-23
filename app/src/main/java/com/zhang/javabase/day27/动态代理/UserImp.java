package com.zhang.javabase.day27.动态代理;

import com.zhang.javabase.interfaces.IUser;

public class UserImp implements IUser {

	@Override
	public void add() {
		//System.out.println("权限校验");
		System.out.println("添加功能");
		//System.out.println("日志记录");
	}

	@Override
	public void delete() {
		//System.out.println("权限校验");
		System.out.println("删除功能");
		//System.out.println("日志记录");
	}

}
