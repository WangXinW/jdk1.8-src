package indi.wangx.java.designpatterns.proxy.dynamicp.jdk;
/**
 * 电动车
 * @author 27630
 *
 */
public class ElectricCar implements Vehicle,Rechargable{
	@Override
	public void drive() {
		System.out.println("drive");
	}
	
	@Override
	public void recharge() {
		System.out.println("recharge");
	}
}
