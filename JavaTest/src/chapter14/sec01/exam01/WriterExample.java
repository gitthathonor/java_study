package chapter14.sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		//1바이트씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); //출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); //출력 스트림을 닫음
	}
}
