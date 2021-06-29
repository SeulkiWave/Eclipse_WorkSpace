package byteStream.nodeStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws  Exception {
		
		FileInputStream fis = new FileInputStream("");
		FileOutputStream fos = new FileOutputStream("");
		int count = 0;
		
		while (true) {
			int readByte = fis.read();
			if (readByte == -1) break; 
			fos.write(readByte);
			count++;
		}
		fis.close();
		fos.close();
		System.out.println(">> FileCopy: "+count+"bytes copy complete . . .");
	} // main end

}
