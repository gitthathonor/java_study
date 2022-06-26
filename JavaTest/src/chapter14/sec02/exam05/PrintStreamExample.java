package chapter14.sec02.exam05;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		// 바이트 기반 출력 스트림을 생성하고 PrintStream 보조 스트림 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		// 라인 단위로 문자열 출력
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		// 버퍼에 잔류하는 문자열을 모두 보내고, 출력 스트림 닫음
		ps.flush();
		ps.close();
	}
}
