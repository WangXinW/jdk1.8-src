package indi.wangx.java.thread.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 27630
 * @since 2019-09-30
 */
public class ReentrantLockTest {

	private Lock lock = new ReentrantLock();
	
	public void testReentrantLock() {
		try {
			lock.lock();
			for (int i = 0;i < 10;i++) {
				Thread.sleep(10);
				System.out.println("ThreadName=" + 
				    Thread.currentThread().getName() + ",i=" + i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
