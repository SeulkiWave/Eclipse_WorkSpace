package byteStream.filterStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class AccountFileReadMain {

	public static void main(String[] args)  throws Exception{
		/*
		 * 파일(accounts.ser)에서Account데이타읽어서 --> Account객체복원
		 */
		System.out.println(
				"파일(accounts.ser)-->Account데이타읽어서 Account객체생성");
		DataInputStream dis=
				new DataInputStream(new FileInputStream("accounts.ser"));
		Account account1=
				new Account(dis.readInt(),
							dis.readUTF(),
							dis.readInt(),
							dis.readDouble());
		Account account2=
				new Account(dis.readInt(),
							dis.readUTF(),
							dis.readInt(),
							dis.readDouble());
		dis.close();
		Account.headerPrint();
		account1.print();
		account2.print();
		
	}

}