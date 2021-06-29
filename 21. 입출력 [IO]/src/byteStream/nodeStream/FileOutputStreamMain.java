package byteStream.nodeStream;

import java.io.FileOutputStream;

/*
 * << 출력 스트림 사용 >>
 *  1. 데이터 목적지target, destination 선정 (파일)
 *  2. 출력 스트림OutputStream 객체 생성 FileOutputStream
 *  3. 출력 스트림OutputStream에 한 바이트씩 작성 Write
 *  4. 출력 스트림OutputStream 닫기 Close
 */

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fileOut.dat");
		
		// public abstract void write (int b) throws IOException;
		// Write the specified byte to this output stream.
		// The general contract for write is that one byte is written to the output stream.
		// The byte  to be written is the eight low-order bits of the argument b.
		// The 24 high-order bits of b are ignored.
		// Subclasses of OutputStream must provide an implementation for this method.
		fos.write(65); // !!!
		// 00000000 | 00000000 | 00000000 | 01000001 :: 이미지의 일부일 수도 exe 파일의 일부일 수도,. . . . 데이터 이동을 위한 int 타입을 사용한 byte로 전송하는 것..
		fos.write(66);
		// 00000000 | 00000000 | 00000000 | 01000010		
		fos.write(2147483647);
		// 01111111 | 11111111 | 11111111 | 11111111
		
		fos.close();
		System.out.println("FileOutputStream.write --> fileOut.dat");
		
	}

}
