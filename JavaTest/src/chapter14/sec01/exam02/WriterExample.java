package chapter14.sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		byte[] array = {10,20,30};
		
		os.write(array); //배열의 모든 바이트를 출력
		
		os.flush();
		os.close();
		
	}
}
