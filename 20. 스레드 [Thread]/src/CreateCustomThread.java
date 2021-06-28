
public class CreateCustomThread extends Thread {
	
	@Override // (1) Thread 객체를 상속받는다 - (2) Thread class의 run 메소드를 override받음
	public void run() {
		System.out.println("ㄱ. "+Thread.currentThread().getName()+"스레드 실행");
		System.out.println("ㄴ. "+Thread.currentThread().getName()+"스레드 반환");
		return;
	}
	
}
