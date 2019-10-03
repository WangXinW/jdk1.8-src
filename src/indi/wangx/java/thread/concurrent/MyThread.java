package indi.wangx.java.thread.concurrent;

/**
 * @author 27630
 * @since 2019-09-30
 */
public class MyThread implements Runnable{
	private ReentrantLockTest rlt;
	
	public MyThread(ReentrantLockTest rlt) {
		this.rlt = rlt;
	}

	@Override
	public void run() {
		rlt.testReentrantLock();
	}
}
