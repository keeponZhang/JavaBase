package com.zhang.javabase.day24.syn;

public class Demo1_Synchronized {

	/**
	 * @param args
	 * 同步代码块
	 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	}

}

class Printer {
	Demo d = new Demo();
	public void print1() {
		//synchronized(new Demo()) {							//同步代码块,锁机制,锁对象可以是任意的
		synchronized(d) {
			System.out.print("k");
			System.out.print("e");
			System.out.print("e");
			System.out.print("p");
			System.out.print("o");
			System.out.print("n");
			System.out.print("\r\n");
		}
	}
	
	public void print2() {
		//synchronized(new Demo()) {							//锁对象不能用匿名对象,因为匿名对象不是同一个对象
		synchronized(d) {		
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
		}
	}
}

class Demo{}