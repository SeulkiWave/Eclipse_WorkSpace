import java.util.Date;

public class ControlSleepThread extends Thread{
	
	@Override // 재정의: 메소드 인자, 리턴타입, +a가 동일해야 하는데
	public void run() { // throws runtimeException이 생략되어 있다.. (사용자가 만들어낼 수 있는 오류!) 
		while (true) {
			// 이 상황에서는 (2)만 가능한 이유:
			// (1)로 던지려고 할 때 -> 재정의 위반! run 자체는 원래 아무것도 던지지 않던(throw) 메소드였는데 override 되면서 throw를 하게 될 수가 없다... can't throws InterruptedException (같거나 좁아야 하는데 넓어짐)
			// 확장되면 재정의 위반 ==> 처리하는 구문이 필요하다 : ............... throws 공부하자
			try { // exception 처리하는 방법 2개! (1) throws Exception / (2) try-catch!
				System.out.println("ControlSleepThread: 1sec");
				Date now = new Date();
				System.out.println(now.toString());
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
