package indi.wangx.java.extend.package2;

import indi.wangx.java.extend.package1.Father;

public class Son extends Father{

	public Son() {
		Father f = new Father();
		// f.a = 1;
		super.a = 2;
		this.a = 3;
	}
}
