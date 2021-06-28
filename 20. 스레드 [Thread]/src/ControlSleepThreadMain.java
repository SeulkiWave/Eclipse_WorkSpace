
public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception{
		
		System.out.println("1. main");
		System.out.println("2. main thread 3sec sleep");
		Thread.sleep(3000); // 1000ms = 1s
		// Unhandled exception type InterruptedException --> throws Exception 필요!
		// Causes the currently executing thread
		// to sleep (temporarily cease execution) for the specified number of milliseconds,
		// subject to the precision and accuracy of system timers
		
		System.out.println("3. main thread start after 3sex");
		
		ControlSleepThread cst = new ControlSleepThread();
		cst.start();
		
		System.out.println("4. main thread return;");
		
	}

}
