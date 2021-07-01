package byteStream.objectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import byteStream.filterStream.Account;

public class AccountArrayListDeSerializationMain {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream ("accArrayList.ser"));
		List<Account> accList = (List<Account>)ois.readObject();
		
		System.out.println(">> accArrayList.ser --> AccountArrayList 객체 복원");
		Account.headerPrint();
		for (Account acc: accList) {
			acc.print();
		}
		
		
	}
}
