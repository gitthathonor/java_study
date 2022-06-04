package chapter13.sec01.exam01;

import java.util.ArrayList;
import java.util.List;

// 자바에서는 널리 알려져 있는 자료구조(Data Structure)를 사용해서 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 인터페이스와
// 구현 클래스를 java.util 패키지에서 제공합니다. -> "컬렉션 프레임워크"
// 컬렉션의 주요 인터페이스로는 List, Set, Map이 있다.

// List 컬렉션
// 배열과 비슷하게 객체를 인덱스로 관리
// 저장용량이 자동으로 증가(길이가 무한한 배열)
// 객체 자체를 저장하는 것 X -> 객체의 번지를 참조
// 그렇기 때문에 동일한 객체를 중복 저장 가능
// null도 저장 되는데, 해당 인덱스는 객체를 참조하지 않는다.
// 종류로는 ArrayList, Vector, LinkedList


public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //ArrayList를 List로 업캐스팅 
		
		// String 객체를 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); //저장된 총 객체 수 얻기
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2); //2번 인덱스의 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();
		
		
		 // 저장된 총 객체 수만큼 루핑
//		for(int i=0; i<list.size(); i++) {
//			String str = list.get(i);
//			System.out.println(i + ":" + str);
//		}
		
		// 향상된 for문을 이용한 루핑
		for(String e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		list.remove(2); //2번 인덱스 객체(Database) 삭제됨
		list.remove(2); //2번 인덱스 객체(Servlet/JSP) 삭제됨
		list.remove("iBATIS");
		
		int index = 0;
		for(String str : list)
			System.out.println(index++ + ":" + str);
		
	}

}
