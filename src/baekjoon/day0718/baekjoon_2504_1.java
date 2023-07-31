package baekjoon.day0718;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
//--------------------------------------이거 안됨ㅌ
public class baekjoon_2504_1 {
	private static Stack<Character> stack = new Stack<>();
	private static LinkedList<Integer> intArr = new LinkedList<>();
	private static boolean t;
	
	private static void numFunc(char ch, int n) {
		int result = 0;
		if(stack.contains(ch)) {
			while(!stack.empty()) {
				if(stack.pop() == ch) {
					if(result == 0) {
						result += n;
					}else {
						result *= n;
					}
					break;
				}else {
					result += intArr.removeLast();
				}
			}
			stack.add('r');
			intArr.add(result);
		}else {
			t = true;
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = br.readLine();

		t = false;
		char[] data = line.toCharArray();
		
		for(char i : data) {
			if(i == ')') {
				numFunc('(', 2);
			}else if(i == ']') {
				numFunc('[', 3);
			}else {
				stack.add(i);
			}
			if(t) {
				break;
			}
		}
		if(stack.contains('(') || stack.contains(')') ||
		   stack.contains('[')|| stack.contains(']') || t == true)
			System.out.println(0);
		else {
			int sum = 0;
			for(int i : intArr) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}
