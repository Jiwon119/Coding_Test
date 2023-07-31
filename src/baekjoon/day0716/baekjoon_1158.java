package baekjoon.day0716;

import java.util.LinkedList;
import java.util.Scanner;

// 1158. 요세푸스 문제 - LinkedList
// 12:50-1:21 (30분)
//메모리 18264kb		시간 276ms
public class baekjoon_1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		LinkedList<Integer> data = new LinkedList<Integer>();
		int index = 0;

		for (int i=0; i<n; i++) data.add(i+1);
		
		for (int i=0; i<n; i++) {
			index += (k-1);
			while(index >= data.size()) {
				index -= data.size();
			}
			
			sb.append(data.get(index));
			if(i != n-1) sb.append(", ");
			data.remove(index);
		}
		sb.append('>');

		System.out.println(sb);
	}
}
