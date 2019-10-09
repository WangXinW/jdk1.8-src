package indi.wangx.java.designpatterns.singleton;

public class LazySingleton {
	private static LazySingleton lazySingleton;
	
	public static synchronized LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}
