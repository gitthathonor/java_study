package chapter14.sec02.exam06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjectStreamExcample {
	public static void main(String[] args) throws Exception {
		writeList(); // List를 파일에 저장
		List<Board> list = readList(); // 파일에 저장된 List 읽기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" +
				board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>(); // List 생성
		
		// list에 Board 객체 저장
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		
		// 객체 출력 스트림을 이용해서 list 출력
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception {
		
		// 객체 입력 스트림을 이용해서 list 읽기
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>)ois.readObject();
		return list;
	}
}
