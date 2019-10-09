package indi.wangx.java.designpatterns.proxy.staticp;

public class CarCustomer implements CoustomerI{

	public CarCustomer(String name) {
		this.name = name;
	}
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void buy() {
		System.out.println(this.name + " buy a car");
	}

}
