import com.itwill.shop.ShopService;
import com.itwill.shop.admin.Member;
import com.itwill.shop.admin.MemberService;
// import com.itwill.shop.member; --> 줄임말이 같으면 사용할 수 없다
// import com.itwill.shop.memberservice;
/*
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderService;
*/
import com.itwill.shop.order.*;
public class PackageImportMain {

	public static void main(String[] args) {
		
		Member am1 = new Member();
		System.out.println(am1);
		MemberService ams1 = new MemberService();
		System.out.println(ams1);
		
		Order o1 = new Order();
		System.out.println(o1);
		OrderService oc1 = new OrderService();
		System.out.println(oc1);
		
		ShopService ss1 = new ShopService();
		System.out.println(ss1);
		
		com.itwill.shop.member.Member m1 = new com.itwill.shop.member.Member();
		System.out.println(m1);
		com.itwill.shop.member.MemberService ms1 = new com.itwill.shop.member.MemberService();
		System.out.println(ms1);
		
		
		
		
		
		
		
		
	}

}
