package byteStream.objectStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import byteStream.filterStream.Account;

public class AccountArrayListSerializationMain {

	public static void main(String[] args) throws Exception {
		
			List<Account> accList = Arrays.asList( // ArrayList 객체!
					new Account (1111, "KIM", 56000, 0.3),
					new Account (2222, "AAA", 56000, 0.9),
					new Account (3333, "BBB", 12000, 1.9),
					new Account (4444, "CCC", 89000, 4.9),
					new Account (5555, "DDD", 34000, 0.6),
					new Account (6666, "EEE", 77000, 0.1),
					new Account (7777, "FFF", 11000, 0.3),
					new Account (8888, "GGG", 21000, 2.4),
					new Account (9999, "HHH", 99000, 3.3));
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("accArrayList.ser"));
			oos.writeObject(accList); // ArrayList 타입의 배열로 저장함 왜...?
			
			oos.close();
			
			
		
	}

}
