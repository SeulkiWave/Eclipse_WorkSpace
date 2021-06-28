
public class MainThreadCalled { // Main Thread가 호출하는 객체~
	
	public void main_thread_called_method () {
		System.out.println("\t A."+Thread.currentThread().getName()+"스레드 호출");
		
		System.out.println("\t B."+Thread.currentThread().getName()+"스레드 반환");
		
		return;
		
	}
	
}

