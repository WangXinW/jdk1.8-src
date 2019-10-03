package indi.wangx.java.exception;

import java.lang.Thread.UncaughtExceptionHandler;

import org.junit.Test;

public class ExceptionTest {
	
	@Test
	public  void main() {
		// 设置未捕获异常处理器，这里是默认的，当然你可以自己新建一个类，然后实现UncaughtExceptionHandler接口即可
		/*Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.err.println("程序抛出了一个异常，异常类型为 ： " + e);
			}
		});*/
		 
		Thread.currentThread().setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.err.println("程序抛出了一个异常，异常类型为 ： " + e);
			}
		});
		Thread thread = new Thread(new Task());
		thread.start();
	    }
	
	static class Task implements Runnable {
		@Override
		public void run() {
			throw new NullPointerException();
		}
	}
	
}


