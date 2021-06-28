
public class ControlPriorityMain {
	public static void main(String[] args) {
		System.out.println("1. main");
		ControlPriorityUpperThread cut = new ControlPriorityUpperThread();
		ControlPriorityLowerThread clt = new ControlPriorityLowerThread();
		
		// Priority : CPU의 점유율을 얻을 수 있는 우선 순위!
		//  - 1에서 10까지의 우선 순위를 가짐
		
		System.out.println("ControlPriorityUpperThread --> " +cut.getPriority());
		System.out.println("ControlPriorityLowerThread --> " +clt.getPriority());
		
		cut.setPriority(10);
		clt.setPriority(1);
		
		cut.start();
		clt.start();
		
		System.out.println("99. main return");
		
	}
}
