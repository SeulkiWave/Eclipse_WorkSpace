
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		
		System.out.println("1. main thread start");
		
		// (3) Thread 객체를 생성한다
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("User Custom Thread 1"); 
		// (4) Thread 객체를 통해 Thread를 시작시킨다~
		
		// cct.run(); 단일 스레드 상황! main스레드가 run 메소드를 실행시키는거라서!!! (새로운 스레드가 생성된 게 아님!) 절대 반환되지 않음! 아래의 main 메소드 내에 기술된 다른 코드가 실행되지 않음
		cct.start(); // 새로운 스레드를 생성시킨 상황! --> 출력 결과가 다르다~
		// cct 객체의 run을 호출하는 건 main이 아니라 VM (서로 남남~)! VM이 호출하고 해당 새 스레드의 run 메소드를 찾는다 --> 끝났을 때 VM으로 반환된다~
		// Causes this thread to begin execution: the JVM calls the run method of this thread
		// The result is that two thread are running concurrently:
		// the current thread (which returns from the call to the start method: main!) and the other thread (which executes its run method).
		// It is never legal to start a thread more than once. In particular, a thread may not be restarted once it has completed method?
		
		System.out.println("2. main thread");			
				
	}

}
