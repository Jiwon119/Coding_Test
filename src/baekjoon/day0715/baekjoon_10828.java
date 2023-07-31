package baekjoon.day0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10828. 스택
public class baekjoon_10828 {
	public static int[] stack;
	public static int size;
	
	
	public static void push(int num) {
		stack[size] = num;
		size++;
	}
	public static int pop() {
		if(empty() == 1) return -1;
		int num = stack[size-1];
		stack[size-1] = 0;
		size--;
		return num;
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size == 0) return 1;
		else return 0;
	}
	public static int top() {
		if(empty() == 1) {
			return -1;
		}else {
			return stack[size-1];
		}
	}

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		stack = new int[N];
		
		for (int i=0; i<N; i++) {
			String s = bf.readLine();
			StringTokenizer token = new StringTokenizer(s);
			
			switch(token.nextToken()) {
			case("push"):
				push(Integer.parseInt(token.nextToken()));
				break;
			case("pop"):
				System.out.println(pop());
				break;
			case("size"):
				System.out.println(size());
				break;
			case("empty"):
				System.out.println(empty());
				break;
			case("top"):
				System.out.println(top());
				break;
			}
		}
		
	}

}
