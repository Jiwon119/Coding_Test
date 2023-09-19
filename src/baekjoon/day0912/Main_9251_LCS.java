package baekjoon.day0912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main_9251_LCS {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		26개
		List<Integer>[] list = new List[26];
		for (int i = 0; i < 26; i++) {
			list[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < list.length; i++) {
			
		}
		
		
		char[] list1 = br.readLine().toCharArray();
		char[] list2 = br.readLine().toCharArray();
		
		int[] memo = new int[list1.length];
		

 		
		
	}
}
