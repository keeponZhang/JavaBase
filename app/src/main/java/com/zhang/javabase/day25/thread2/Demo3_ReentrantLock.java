package com.zhang.javabase.day25.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3_ReentrantLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Printer3 p = new Printer3();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}

class Printer3 {
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	private int flag = 1;
	public void print1() throws InterruptedException {							
		r.lock();								//获取锁
			if(flag != 1) {
				c1.await(); //c1等待
			}
			System.out.print("k");
			System.out.print("e");
			System.out.print("e");
			System.out.print("p");
			System.out.print("\r\n");
			flag = 2;
			//this.notify();						//随机唤醒单个等待的线程
			c2.signal();//唤醒c2
		r.unlock();								//释放锁
	}
	
	public void print2() throws InterruptedException {
		r.lock();
			if(flag != 2) {
				c2.await();
			}
			System.out.print("j");
			System.out.print("o");
			System.out.print("h");
			System.out.print("n");
			System.out.print("\r\n");
			flag = 3;
			//this.notify();
			c3.signal();
		r.unlock();
	}
	
	public void print3() throws InterruptedException {
		r.lock();
			if(flag != 3) {
				c3.await();
			}
			System.out.print("t");
			System.out.print("o");
			System.out.print("m");

			System.out.print("\r\n");
			flag = 1;
			c1.signal();
		r.unlock();
	}
}

