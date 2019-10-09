package indi.wangx.java.designpatterns.factory;

public class SimpleFactory implements AbstractFactory{
	/**获取SubjectA的条件*/
	public static final String CONDITION_A = "A";
	/**获取SubjectB的条件*/
	public static final String CONDITION_B = "B";
	
	
	
	public AbstractSubjectI getSubject(String condition) {
		if (CONDITION_A.equals(condition)) {
			return new SubjectA();
		} else if (CONDITION_B.equals(condition)) {
			return new SubjectB();
		}
		return null;
	}


	@Override
	public AbstractSubject2I getSubject2(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
}
