package indi.wangx.java.extend;

import org.junit.Test;

public class MethodInvokeTest {
	
	public class Human {
		
		public void sayHello() {
			System.out.println("Human");
		}
		
		public void sayHello(Human human){
			System.out.println("Human");
		}
	}
	
	public class Man extends Human{
		@Override
		public void sayHello() {
			System.out.println("Human");
		}
		
		public void sayHello(Man man){
			System.out.println("man");
		}
	}
	
	public class Women extends Human{
		@Override
		public void sayHello() {
			System.out.println("Human");
		}
		
		public void sayHello(Women women){
			System.out.println("woman");
		}
	}
	
	// 方法重载是静态分派,静态分派由编译器完成
	@Test
	public void testOverloadMethodInvoke() {
		Human man = new Man();
		Human women = new Women();
		man.sayHello(man);
		women.sayHello(women);
	}
	
	// 方法重载是动态分派,在栈帧的局部变量表的第0个slot中存放对象的应,在调用的时通过实例对象找到对应的方法，如果找不到会依次往上（父类）找
	@Test
	public void testOverrideMethodInvoke() {
		Human man = new Man();
		Human women = new Women();
		man.sayHello();
		women.sayHello();
	}
}
