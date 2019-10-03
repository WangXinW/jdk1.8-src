package indi.wangx.java.thread.concurrent;

import org.junit.Test;

public class Main {

	@Test
	public void test() {
		ReentrantLockTest rlt = new ReentrantLockTest();
		Thread t1 = new Thread(new MyThread(rlt));
		Thread t2 = new Thread(new MyThread(rlt));
		Thread t3 = new Thread(new MyThread(rlt));
		t1.start();
		t2.start();
		t3.start();
	}
}
