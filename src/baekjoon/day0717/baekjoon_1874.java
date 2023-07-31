package baekjoon.day0717;

import java.util.Scanner;
import java.util.Stack;

//1874. 스택 수열
//
//메모리 kb		시간 ms
public class baekjoon_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int[] data = new int[N];
		for (int i=0; i<N; i++) {
			data[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int index = 0;
		int num = 1;
		while(true) {
			if(index >= N || num > N) {
				break;
			}
			
			stack.add(num);
			sb.append('+').append('\n');
			
			if(data[index] == num) {
				stack.pop();
				sb.append('-').append('\n');
				index++;
				while(true) {
					if(stack.empty()) break;
					if(data[index] != stack.peek()) {
						break;
					}
					stack.pop();
					sb.append('-').append('\n');
					index++;
				}	
			}
			num++;
		}
		if(!stack.empty()) System.out.println("NO");
		else System.out.println(sb);
	}

}
