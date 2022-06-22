package chapter14.sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(
				ReadLineExample.class.getResource("language.txt").getPath()
		);
		BufferedReader br = new BufferedReader(reader); // BufferedReader 보조 스트림 연결
		
		while(true) {
			String data =  br.readLine(); //라인 단위 문자열을 읽고 리턴
			if(data == null) break; //파일 끝에 도달했을 경우
			System.out.println(data);
		}
		
		br.close(); // 입력 스트림 닫기
	}

}
