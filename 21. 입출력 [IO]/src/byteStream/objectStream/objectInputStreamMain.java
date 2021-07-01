package byteStream.objectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import byteStream.filterStream.Account;

public class objectInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream("objects.ser"));
		
		System.out.println(">> objects.ser --> String");
		String readStr = (String)ois.readObject();
		System.out.println(readStr);
		
		System.out.println(">> objects.ser --> Integer");
		Integer readInt = (Integer) ois.readObject();
		System.out.println(readInt);
		
		System.out.println(">> objects.ser --> Account ");
		Account readAcc1 = (Account) ois.readObject();
		System.out.println(readAcc1.getOwner());
		
		System.out.println(">> objects.ser --> Account ");
		Account readAcc2 = (Account) ois.readObject();
		readAcc2.print();
		System.out.println(readAcc2); // 신기하게 나온당 Double은 아예 안 나옴
		
		ois.close();
		
		
		
	}

}
