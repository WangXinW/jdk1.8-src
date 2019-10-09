package indi.wangx.java.designpatterns.factory;

public interface AbstractFactory {
	
	AbstractSubjectI getSubject(String condition);
	AbstractSubject2I getSubject2(String condition);
}
