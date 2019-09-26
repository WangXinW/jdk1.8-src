package indi.wangx.java.thread;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 * 测试TimeUnit
 * @author 27630
 * @since 2019-09-24
 */
public class TimeUnitTest {

	@Test
	public void testTimeUnit() throws InterruptedException {
		// sleep
		TimeUnit.SECONDS.sleep(5);
		// convert
		TimeUnit.SECONDS.toMillis(1);
	}
}
