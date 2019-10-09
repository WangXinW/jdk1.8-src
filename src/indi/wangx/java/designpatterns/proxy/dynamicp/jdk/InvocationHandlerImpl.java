package indi.wangx.java.designpatterns.proxy.dynamicp.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * invocationHandler类
 * @author 27630
 *
 */
public class InvocationHandlerImpl implements InvocationHandler{
	
	private ElectricCar car;
	
	public InvocationHandlerImpl(ElectricCar car) {
		this.car = car;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before method invoke.the method is :" + method.getName());
		method.invoke(car, null);
		System.out.println("after method invoke.the method is :" + method.getName());
		return null;
	}

}
