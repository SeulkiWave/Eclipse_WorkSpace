
public class HomeAppFactoryMain {

	public static void main(String[] args) {
		
		System.out.println("가전 제품 공장 ------------------------------");
		
		HomeTV tv1 = new HomeTV();
		HomeTV tv2 = new HomeTV();
		HomeTV tv3 = new HomeTV();
		
		HomeAudio audio1 = new HomeAudio();
		HomeAudio audio2 = new HomeAudio();
		
		HomeApplicationOnOff homeApp1 = tv1;
		HomeApplicationOnOff[] homeAppArray = new HomeApplicationOnOff[5];
		
		homeAppArray[0] = tv1;
		homeAppArray[1] = tv2;
		homeAppArray[2] = tv3;
		homeAppArray[3] = audio1;
		homeAppArray[4] = audio2;
		
		System.out.println("가전 제품 검사소: 볼륨, 전원 검사 --------------------");
		/*
		 * 자식 클래스 타입을 사용하지 않는 경우!
		 * 	==> 부모 타입(HomeApplicationOnOff, HomeApplicationVolumn)만 사용하는 경우~
		 * 		가전 제품 검사용 프로그램을 한 번 만들어서 변경 없이 계속 사용할 수 있음!
		 */
		HomeApplicationOnOff[] recvHomeAppArray = homeAppArray;
		for (int i=0; i < recvHomeAppArray.length; i++) {
			recvHomeAppArray[i].on();
			HomeApplicationVolumn tempHome = (HomeApplicationVolumn)recvHomeAppArray[i];
			tempHome.volumnUp();
			tempHome.volumnDown();
			recvHomeAppArray[i].off();
			System.out.println("검 (완) 사");
			
		}
		
		System.out.println("가전 제품 검사소 (객체 사용): 볼륨, 전원 검사 --------------------");
		HomeAppTest gg = new HomeAppTest(); // <-- 이 부분 다시 공부하자... 빡머가리절대안됨
		
		
		
		
		
		
		
		
		
	}

}
