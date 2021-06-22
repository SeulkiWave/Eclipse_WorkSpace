import com.itwill.shop.ShopService;

/*
	package 
		1. 관련있는(업무) 클래스의 모음(패키지)
		2. 패키지의 이름은 계층적으로 큰 범위부터 작은 범위로 구성  
		3. 클래스의 완전한 이름은 패키지를 포함한 이름이다.
		4. 중복 이름을 피하기 위해서 
			ex> package samson.sds.chongmu;
				public class Chongmu1{
				}
		5.compile 방법: >javac -d . XXX.java  	
*/

public class PackageMain {

	public static void main(String[] args) {
		
		com.itwill.shop.admin.Member adMem1 = new com.itwill.shop.admin.Member();
		System.out.println(adMem1);
		
		com.itwill.shop.admin.MemberService adSer = new com.itwill.shop.admin.MemberService();
		System.out.println(adSer);
		
		com.itwill.shop.member.Member mMem1 = new com.itwill.shop.member.Member();
		System.out.println(mMem1);
		
		com.itwill.shop.member.MemberService mSer1 = new com.itwill.shop.member.MemberService();
		System.out.println(mSer1);
		
		com.itwill.shop.order.Order ord1 = new com.itwill.shop.order.Order();
		System.out.println(ord1);
		
		com.itwill.shop.order.OrderService ordSer1 = new com.itwill.shop.order.OrderService();
		System.out.println(ordSer1);
		
		com.itwill.shop.ShopService shSer1 = new com.itwill.shop.ShopService();
		System.out.println(shSer1);
		
		
		
	}

}
