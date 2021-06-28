
public class ControlStopThread1 extends Thread{
	
	@Override
	public void run() throws RuntimeException{
		for (int i = 1; i <= 100; i++) {
			System.out.println("DOWNLOADING...: "+i+"%");
		}
		System.out.println("ControlStopThread1: JVM returns thread end");
	}
	
}
