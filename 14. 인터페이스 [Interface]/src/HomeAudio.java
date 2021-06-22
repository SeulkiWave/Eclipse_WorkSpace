public class HomeAudio implements HomeApplicationVolumn, HomeApplicationOnOff {
	
	public void volumnUp() {
		System.out.println("Audio.volumnUp()");
	}
	
	@Override
	public void on() {
		System.out.println("Audio.on()");
	}

	@Override
	public void off() {
		System.out.println("Audio.off()");		
	}

	@Override
	public void volumnDown() {
		System.out.println("Audio.volumnDown()");
		
	}
	
	
}
