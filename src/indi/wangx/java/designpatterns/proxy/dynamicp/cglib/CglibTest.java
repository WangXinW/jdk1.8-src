package indi.wangx.java.designpatterns.proxy.dynamicp.cglib;

import org.junit.Test;

import net.sf.cglib.proxy.Enhancer;

public class CglibTest {

	@Test
	public void testCblib() {
		ProgrammerMethodInterceptor pmi = new ProgrammerMethodInterceptor();
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(Programmer.class);
		enhancer.setCallback(pmi);
		Programmer proxy = (Programmer) enhancer.create();
		proxy.code();
	}
}
