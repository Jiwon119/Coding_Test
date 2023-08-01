package dataStructure;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Set : 집합(Set) 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 자료형이다.
 * 		 1.중복을 허용하지 않는다.
 * 		 2.순서가 없다(Unordered).
 * 		 종류 - HashMap
 * 			  TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징
 * 			  LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징 
 * 		 메서드  - 교집합(retainAll)	- s1.retainAll(s2);
 * 			  - 합집합(addAll)	- s1.addAll(s2);
 * 			  - 차집합(removeAll)	- s1.removeAll(s2);
 * 			  - add(값 추가), addAll(값 여러개 추가), remove(특정 값 제거) ..
 * 			  - Iterator(값 출력위해 담아서 출력) - Iterator<데이터타입> iterator명 = set명.Iterator();
 * 										   - Iterator명.next();
 * */

public class dataStructure_Set {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("b"); // set에 중복값 저장 불가 
		set.add("c"); // set에 값 담기
		
		System.out.println("set 크기 확인 : " + set.size());
		Iterator<String> iter = set.iterator(); // set을 Iterator 안에 담기
		while(iter.hasNext()) { // iterator에 다음 값이 있다면
			System.out.println("iterator : " + iter.next()); // iter에서 값 꺼내기
		}
	}
}
