public class HomeTV implements HomeApplicationVolumn, HomeApplicationOnOff {
	
	public void operation1() {
		System.out.println("Tv.operation1()");
	}
	
	
	public void tv1() {
		System.out.println("");
	}

	@Override
	public void on() {
		System.out.println("TV.on()");
	}
	@Override
	public void off() {
		System.out.println("TV.off()");
		
	}
	@Override
	public void volumnUp() {
		System.out.println("TV.volumnUp()");
	}
	@Override
	public void volumnDown() {
		System.out.println("TV.volumnDown()");
	}
	
	
}
