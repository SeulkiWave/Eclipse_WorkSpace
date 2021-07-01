package byteStream.filterStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

public class AccountArrayListFilterWriteMain {

	public static void main(String[] args) throws Exception {
		List<Account> accList = Arrays.asList(
				new Account (1111, "KIM", 56000, 0.3),
				new Account (2222, "AAA", 56000, 0.9),
				new Account (3333, "BBB", 12000, 1.9),
				new Account (4444, "CCC", 89000, 4.9),
				new Account (5555, "DDD", 34000, 0.6),
				new Account (6666, "EEE", 77000, 0.1),
				new Account (7777, "FFF", 11000, 0.3),
				new Account (8888, "GGG", 21000, 2.4),
				new Account (9999, "HHH", 99000, 3.3));
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("accList.ser"));
		for (Account acc : accList) {
			dos.writeInt(acc.getNo());
			dos.writeUTF(acc.getOwner());
			dos.writeInt(acc.getBalance());
			dos.writeDouble(acc.getIyul());
		}
		dos.close();
		System.out.println(">> List의 Account 객체들: accList.ser");
		
	}

}
