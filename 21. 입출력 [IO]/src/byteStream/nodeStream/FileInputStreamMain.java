package byteStream.nodeStream;

import java.io.FileInputStream;

public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		/*
		 * << 입력 스트림 사용 >>
		 * 1. data source 선정 (파일)
		 * 2. 입력 스트림InputStream 객체 생성 FileInputStream
		 * 3. 입력 스트림InputStream으로부터 한 바이트씩 읽는다 read
		 * 4. 입력 스트림InputStream 닫기 Close
		 */
		
		FileInputStream fis = new FileInputStream("fileOut.dat");
		int readByte = fis.read();
		System.out.println("1. byte: "+Integer.toBinaryString(readByte)); // 앞의 0은 표시 안 됨!
		readByte = fis.read();
		System.out.println("2. byte: "+Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("3. byte: "+Integer.toBinaryString(readByte));
		// public abstract int read () throws Exception;
		// Reads the next byte of data from the input stream.
		// The value byte is returned as an int in the range 0 to 255.
		// If no byte if available because the end of the stream has been reached; the value -1 is returned.
		// This method blocks until input data is available, the end of the stream is detected, or an exception is thrown.
		// A subclass must provide an implementation of this method.
		// Returns: the next byte of data, or -1 if the end of the stream is reached.
		
		while (true) {
			readByte = fis.read();
			if (readByte == -1) break;
			System.out.println(Integer.toBinaryString(readByte));
			} // while end
		fis.close();
		System.out.println("FileInputStream.read() --> fileOut.dat");
		
	}

}
