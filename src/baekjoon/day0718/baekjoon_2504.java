package baekjoon.day0718;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon_2504 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		char[] data = line.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		int sum = 0;
		int mul = 1;
		
		for(int i=0; i<data.length; i++) {
			if(data[i] == '(') {
				mul *= 2;
				stack.add('(');
			}
			
			else if(data[i] ==')') {
				if(stack.empty() || stack.peek() != '(') {
					sum = 0;
					break;
				}
				if(data[i-1] == '(') 
					sum += mul;
				mul /= 2;
				stack.pop();
			}else if(data[i] == '[') {
				mul *= 3;
				stack.add('[');
			}else if(data[i] ==']') {
				if(stack.empty() || stack.peek() != '[') {
					sum = 0;
					break;
				}
				
				if(data[i-1] == '[') 
					sum += mul;
				mul /= 3;
				stack.pop();
			}
		}
		System.out.println(sum);
		
	}
}
