/*
! 스레드 (thread, 실행흐름) !
	- 프로그램 코드를 실행시키는 힘! 하나의 프로세스에서 사용하는 흐름의 단위~
	- main thread, AWT thread, 사용자 정의 스레드
	- 사용 목적: 두 가지 일을 동시에 해야할 때
	
- 스레드 객체 생성 방법 / 형식
	< type A >
	1. Thread 클래스를 상속 받는다.
	2. Thread class의 run method를 overriding 한다. / 동사원형: public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를 통해서 Thread를 시작시킨다.
	
    < type B >
	1. Runnable interface를 implements 한다.
	2. Runnable interface를 implements받은 객체를 Thread 클래스의 생성자에 넣어서 Thread 객체를 생성한다
    3. Thread 를 시작시킨다.

	< 형식 >
	1. Thread 클래스를 상속받아서 만든다..
		ex> public class ThreadEx extends Thread {			// run 메소드를 재정의 해야한다.
					public void run() {			// 사용자가 만든 스레드가 실행할 코드
          		 }
			}
    2. Runnable interface를 implements해 만든다.
		ex> public class ThreadImpl implements Runnable{
				public void run(){
				}
			}
*/

public class MainThreadMain {

	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		// 현재 코드를 실행시키는 main 스레드의 스레드 객체 얻기......(참조를 얻는...) : 스레드와 스레드 객체를 구분하자 --> 새 스레드를 만들기 위해 스레드 객체를 사용해야 한다~
		// Returns a reference to the currently executing thread object.
		Thread mainThread = Thread.currentThread();
		String currentThreadName = mainThread.getName();
		int priority = mainThread.getPriority();
		System.out.println("Main Thread name: "+currentThreadName);
		System.out.println("Main Thread Priority: "+priority);
		
		MainThreadCalled mtc = new MainThreadCalled();
		mtc.main_thread_called_method();
		
		System.out.println("Main Thread Return");
	}

}
