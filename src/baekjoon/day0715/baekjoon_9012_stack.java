package baekjoon.day0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 9012. 괄호 - stack 자료구조 활용
// 9:56-10:15 (25분)
// charAt() : String 문자열의 문자를 char 타입으로 변환해주는 함수
// EX. str.charAt(0) -> str의 0번째 문자 반환 
// 스택 자료구조 활용
public class baekjoon_9012_stack {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(bf.readLine());
		
		for(int test=0; test<test_case; test++) {
			String data = bf.readLine();
			Stack<Character> stack = new Stack<>();
			String result =  "YES";
			
			for (int i=0; i<data.length(); i++) {
				char c = data.charAt(i);
				if (c == '(') {
					stack.push(c);
				} else {
					if(stack.empty()) { 
						result = "NO";
						break;
					}
					stack.pop();
				}
			}
			if(stack.empty() && result.equals("YES")) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}
}
