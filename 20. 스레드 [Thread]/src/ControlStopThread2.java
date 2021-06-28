
public class ControlStopThread2 extends Thread{
	private boolean isPlay; // 선언할 때 아무것도 지정 안 하면 false로 초기화된다~
	public ControlStopThread2() {
		isPlay = true;
	}
	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}
	@Override
	public void run() {
		while (isPlay) {
			try {
				Thread.sleep(500);
				System.out.println("play();");
				System.out.println("fight~");
				System.out.println("get score!");
				System.out.println("power up");
				System.out.println("update score~");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
