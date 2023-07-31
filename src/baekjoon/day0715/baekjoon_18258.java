package baekjoon.day0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 18258. Queue - 직접구현
public class baekjoon_18258 {
	public static int[] Queue;
	public static int size;
	public static int front;
	

	public static void push(int num) {
		Queue[front+size] = num;
		size++;
	}
	public static int pop() {
		if(size == 0) return -1;
		int popNum = Queue[front];
		front++;
		size--;
		return popNum; 
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size == 0) return 1;
		else return 0;
	}
	public static int front() {
		if(size == 0) return -1;
		else return Queue[front];
	}
	public static int back() {
		if(size == 0) return -1;
		else return Queue[front+size-1];
	}
		
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		Queue = new int[N];
		size = 0;
		front = 0;
		
		for (int i=0; i<N; i++) {
			String command = bf.readLine();
			StringTokenizer token = new StringTokenizer(command);
			switch(token.nextToken()) {
			case("push"):
				push(Integer.parseInt(token.nextToken()));
				break;
			case("pop"):
				sb.append(pop()).append('\n');				
				break;
			case("size"):
				sb.append(size()).append('\n');	
				break;
			case("empty"):
				sb.append(empty()).append('\n');	
				break;
			case("front"):
				sb.append(front()).append('\n');	
				break;
			case("back"):
				sb.append(back()).append('\n');	
				break;
			}
		}
		System.out.println(sb);
		
	}
}
