package indi.wangx.java.designpatterns.proxy.staticp;

import org.junit.Test;

public class ProxyMain {
	@Test
	public void testStaticProxy() {
		CarCustomer carCustomer = new CarCustomer("WangXin");
		CarCustomerProxy carCustomerProxy = new CarCustomerProxy(carCustomer);
		carCustomerProxy.buy();
	}
}
