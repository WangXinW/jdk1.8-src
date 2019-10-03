package indi.wangx.java.thread;

import org.junit.Test;

public class ThreadLocalTest {
	// 1线程共享 2线程安全
	static ThreadLocal<Integer> tl = new ThreadLocal<Integer>();
	
	public static class innerThread implements Runnable {
		public static int i = 1;
		
		@Override
		public void run() {
			tl.set(++i);
		}
	}
	
	@Test
	public void testThreadLocal() {
		for (int j = 0;j < 10;j++) {
			Thread t = new Thread(new innerThread());
			t.start();
			System.out.println(tl.get());
		}
	}

	
}
