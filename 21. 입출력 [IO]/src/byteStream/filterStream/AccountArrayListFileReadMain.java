package byteStream.filterStream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountArrayListFileReadMain {

	public static void main(String[] args) throws Exception {
		// 파일 accList.ser --> List <Account> 복원
		
		DataInputStream dis = new DataInputStream (new FileInputStream("accList.ser"));
		List<Account> accList = new ArrayList<Account>(); // 몇 개를 저장했는지 알 수가 없다
		
		while (true) {
			try {
				accList.add(new Account(dis.readInt(), dis.readUTF(), dis.readInt(), dis.readDouble()));
			} catch (EOFException e) {
				System.out.println("EOFException!"); // end of file
				break;
			}
		} // while end
		
		Account.headerPrint();
		for (Account acc : accList) {
			acc.print();
		}
		
		
		
	}

}
