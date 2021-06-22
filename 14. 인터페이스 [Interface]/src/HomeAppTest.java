
public class HomeAppTest {
	
	private HomeApplicationVolumn[] homeApps; // 객체를 만든 후 
	
	public void setHomeApps(HomeApplicationVolumn[] homeApps) { // 여러대(배열)에 값 대입
		this.homeApps = homeApps;
	}
	
	public void HomeApplicationTest() { // 테스트~
		for (int i = 0; i < homeApps.length; i++) {
			System.out.println();
		}
	}
	
}
