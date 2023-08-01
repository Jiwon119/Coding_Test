package dataStructure;

import java.util.HashMap;

/*
 * Map : Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다.
 * 		 맵(Map)은 사전(dictionary)과 비슷
 * 		 1. 요소의 저장 순서를 유지하지 않습니다.
 * 		 2. key :  중복을 허용  X  / value :  중복은 허용 O
 * 		 종류 - HashMap - key와 value를 묶어 하나의 entry로 저장한다는 특징
 * 			  TreeMap - 입력된 key의 소트순으로 데이터가 출력되는 특징
 * 			  LinkedHashMap - 입력된 순서대로 데이터가 출력되는 특징
 * 		 메서드 - get, containsKey, remove, size, 
 * 
 * */

public class dataStructure_Map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
		System.out.println(map.remove("people"));
		System.out.println(map.size());
	}
}
