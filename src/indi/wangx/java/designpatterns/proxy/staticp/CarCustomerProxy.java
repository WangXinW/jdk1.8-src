package indi.wangx.java.designpatterns.proxy.staticp;

public class CarCustomerProxy implements CoustomerI{
	private CarCustomer carCustomer;

	public CarCustomerProxy(CarCustomer carCustomer) {
		this.carCustomer = carCustomer;
	}
	
	@Override
	public void buy() {
		if (null == carCustomer) {
			return;
		}
		// proxy do something before real business logic
		carCustomer.buy();
		// proxy do something after real business logic
	}

}
