package chapter13.sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Java는 한 번만 저장이 된다.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size()); //저장된 객체 수 얻기
		
		iterator = set.iterator(); // 반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) System.out.println("비어있음");
	}
}
