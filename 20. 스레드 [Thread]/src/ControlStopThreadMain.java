import javax.swing.JOptionPane;

public class ControlStopThreadMain {

	public static void main(String[] args) {
		System.out.println("1. main");
		ControlStopThread1 cst1 = new ControlStopThread1();
		cst1.start();
		System.out.println("2. main");
		ControlStopThread2 cst2 = new ControlStopThread2();
		cst2.start();
		
		// 클라이언트가 입력한 숫자가 String 형태로 입력됨... 
		String input = JOptionPane.showInputDialog("스레드를 종료할 방법을 선택하세요 [1. stop 2. play]");
		// main thread가 client의 입력을 받기 위해 스레드를 대기시킨다.
		int stopNo = Integer.parseInt(input);
		if (stopNo == 1) {
			// case 1: 호출한 순간 종료!
			cst2.stop();
		} else if (stopNo == 2) {
			// case 2:
			// 	조건 변경으로 종료 (isPlay --> false)
			// 	현재 진행 중인 작업을 마무리하고 종료!
			cst2.setPlay(false);
		}
		System.out.println("99. main end");
		
	}
}
