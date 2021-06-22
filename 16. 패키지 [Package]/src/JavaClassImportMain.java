import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
// Import: ShortCut!
// Ctrl + Shift + O
		
import java.sql.Connection;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;

// java.lang 패키지 내부에 있는 클래스는 import 구문을 생략할 수 있다.
// import java.lang.String; or import java.lang.*;

public class JavaClassImportMain {

	public static void main(String[] args) {
		
		String str = "Import 생략 가능";
		java.lang.String name = "김슬기";
		
		System.out.println("java.lang.*는 생략이 가능한 package~");
		
		System.out.println(Math.random());
		System.out.println(java.lang.Math.PI);
		
		InputStream in;
		OutputStream out;
		
		Socket socket;
		Connection con;
		
		ShopService ss1;
		Member mm1;
		Order od1;
		OrderService ordSer1;
		Product pd1;
		ProductService pds1;
		
		
		
		
	}
	

}
