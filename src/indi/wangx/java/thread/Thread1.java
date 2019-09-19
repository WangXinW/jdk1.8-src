package indi.wangx.java.thread;

@Controller
public class Thread1 extends Thread implements Runnable{

	private String s = "";
	
	@Override
	public void run() {
		System.out.println("#######Thread1");
	}
	
	@Controller
	class InnerClass {
		private String s = "";
		
		public String getS() {
			return s;
		}
	}
}
