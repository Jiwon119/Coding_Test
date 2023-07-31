package baekjoon.day0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

// 1935. 후위 표기식 2 - stack
// 3:50-5:00 (1시간 10분..) 
// 메모리 14548kb		시간 132ms
public class baekjoon_1935 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] numList = new int[n];
		String s = bf.readLine();

		for(int i=0; i<n; i++) {
			numList[i] = Integer.parseInt(bf.readLine());
		}
		
		int index = 0;
		HashMap<Character, Integer> hashNum = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				if(!hashNum.containsKey(ch)) {
					hashNum.put(ch, numList[index]);
					index++;
				}
			}
		}

		Stack<Double> stack = new Stack<Double>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				stack.add((double)hashNum.get(ch));
			} else {
				double firstNum = stack.pop();
				double secondNum = stack.pop();
				
				switch(s.charAt(i)) {
				case('*'):
					stack.add(secondNum * firstNum);
					break;
				case('/'):
					stack.add(secondNum / firstNum);
					break;
				case('+'):
					stack.add(secondNum + firstNum);
					break;
				case('-'):
					stack.add(secondNum - firstNum);
					break;
				}
			}
		}
		System.out.printf("%.2f", stack.peek());
	}
	
}
