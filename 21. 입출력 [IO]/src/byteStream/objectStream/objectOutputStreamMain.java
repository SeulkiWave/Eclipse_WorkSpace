package byteStream.objectStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import byteStream.filterStream.Account;

public class objectOutputStreamMain {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.ser"));
		// 쓰는 기능은 FileOutput이 담당하고 ObjectOutputStream은 직렬화 부분을 담당한다
		// An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
		// 정확히는 primitive data보다는... Object로 상위 캐스팅 / 박싱 되는 것...
		
		System.out.println(">> String Object Write: ");
		String str1 = new String("객체 스트림");
		// String 이하동문
		oos.writeObject(str1);
		
		System.out.println(">> Integer Object Write: ");
		Integer wi2 = new Integer(2147483647);
		// Integer는 Serializable을 직접 하지는 않나 상위 타입인 Number에서 구현받고 있다~
		oos.writeObject(wi2);
		
		System.out.println(">> Account Object Write: ");
		Account acc3 = new Account(1234, "AAA", 980960, 0.01);
		// oos.writeObject(acc3);
		// NotSerializationException! : 직렬화 객체의 조건
		// (1) 객체가 반드시 java.io.Serializable interface를 구현해야 한다!!!!!!!!!!!!
		// (2) java.io,Serializable interface는 추상 메소드가 존재하지 않는 인터페이스이다.......... --> flag interface라고 부름~.~
		// 		이 객체가 직렬화의 대상임을 표현하기 위한 역할을 하며, 구현해야 하는 메소드가 존재하지 않는..
		oos.writeObject(acc3);
		
		System.out.println(">> Account Object write");
		Account acc4 = new Account(7890, "BBB", 356520, 99.9);
		oos.writeObject(acc4);
		
		oos.flush();
		oos.close();
		
		System.out.println(">> ObjectOutputStream.writeObject(); --> object.ser");
		
		
	}

}
