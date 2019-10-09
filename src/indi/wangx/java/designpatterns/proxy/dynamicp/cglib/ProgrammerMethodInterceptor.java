package indi.wangx.java.designpatterns.proxy.dynamicp.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProgrammerMethodInterceptor implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("before method " +  method.getName() + " invoke");
		proxy.invokeSuper(obj, args);
		System.out.println("after method " + method.getName() + " invoke");
		return null;
	}

}
