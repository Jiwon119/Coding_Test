package baekjoon.day0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

//--------------------------미완성--------------------------------
public class baekjoon_2800 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		int[] data = new int[s.length()];
		LinkedList<Character> arr = new LinkedList<Character>();
		int[][] result = new int[s.length()][2];
		for(int i=0; i<s.length(); i++) {
			data[i] = s.charAt(i);
			arr.add(s.charAt(i));
		}
		
		int i = 0;
		int resultIndex = 0;
		while(true) {
			if(arr.get(i).equals(')')) {
				for(int j=i; j>=0; j--) {
					if(arr.get(j).equals('(')) {
						arr.remove(i);
						arr.remove(j);
						break;
					}
				}
			}
			
			i++;
			if(i > arr.size()) break;
		}
		System.out.println(arr);

	}
}
