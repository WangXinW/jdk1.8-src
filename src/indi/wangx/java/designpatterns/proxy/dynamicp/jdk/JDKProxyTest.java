package indi.wangx.java.designpatterns.proxy.dynamicp.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;


public class JDKProxyTest {
	
	@Test
	public void testJDKProxy() {
		ElectricCar car = new ElectricCar();
		
		ClassLoader classLoader = car.getClass().getClassLoader();
		Class[] interfaces = car.getClass().getInterfaces();
		InvocationHandler handler = new InvocationHandlerImpl(car);
		Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);
		Vehicle vehicle = (Vehicle) o;
		vehicle.drive();
		Rechargable rechargeable = (Rechargable) o;
		rechargeable.recharge();
	}
}
