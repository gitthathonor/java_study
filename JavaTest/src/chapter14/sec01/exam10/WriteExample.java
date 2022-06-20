package chapter14.sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "ABC";
		
		writer.write(str); // 문자열 전체를 출력
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자열을 출력
		writer.close(); // 출력 스트림을 닫음
	}

}
