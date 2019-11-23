package com.zhang.javabase.day27.动态代理;

import com.zhang.javabase.interfaces.IStudent;

import java.lang.reflect.Proxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*UserImp ui = new UserImp();
		ui.add();
		ui.delete();
		
		System.out.println("-------------------------------");*/
		/*
		 * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,
		 * InvocationHandler h)
		 */
		/*MyInvocationHandler m = new MyInvocationHandler(ui);
		IUser u = (IUser)Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), m);
		u.add();
		u.delete();*/
		
		StudentImp si = new StudentImp();
		si.login();
		si.submit();
		
		System.out.println("-------------------------------");
		MyInvocationHandler m = new MyInvocationHandler(si);
		IStudent s = (IStudent)Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);
		
		s.login();
		s.submit();
	}

}
