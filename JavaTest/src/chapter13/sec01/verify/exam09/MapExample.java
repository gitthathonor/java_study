package chapter13.sec01.verify.exam09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		map.put("white", 97);
		map.put("white", 98);
		map.put("black", 89);
		map.put("green", 91);
		
		
		String name = null; // 최고 점수를 받은 아이디 계정
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장
		
		// 코드 작성
		Set<String> keySet = map.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String name2 = iterator.next();
			int i = (int)map.get(name2);
			
			if(maxScore < i) {
				maxScore = i;
				name = name2;
			} 
			
			totalScore += i;
		}
		
		System.out.println(totalScore);
		System.out.println(maxScore);
		
		System.out.println("평균점수 : " + totalScore/map.size());
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		
		
		// 다른 풀이
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		
//		for(Map.Entry<String, Integer> entry : entrySet) {
//			if(entry.getValue()>maxScore) {
//				name = entry.getKey();
//				maxScore = entry.getValue();
//			}
//			totalScore += entry.getValue();
//		}
//		
//		int avgScore = totalScore / map.size();
//		System.out.println("평균점수: " + avgScore);
//		System.out.println("최고점수: "  + maxScore);
//		System.out.println("최고점수를 받은 아이디: " + name);
		
	}
}
