package baekjoon.day0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;


// --------------------------미완성--------------------------------
public class baekjoon_2800_1 {

//	arr : 조합을 뽑아낼 배열
//	r : 조합의 길이(뽑을 개수)
//	visited : 조합에 뽑혔는지를 확인하기 위한 배열 
	static void comb(LinkedList<int[]> arr, boolean[] visited, int start, int n, int r) {
		if(r==0) {
			for(int i = 0; i < arr.size(); i++) {
	            if(visited[i] == true)
	                System.out.print("[" + arr.get(i)[0] + " " + arr.get(i)[1] + "]");
	        }
	        System.out.println();
		}else {
			for(int i=start; i<n; i++) {
				visited[i] = true;
				comb(arr, visited, i+1, n, r-1);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		char[] data = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		Stack<Integer> index = new Stack<>();
		LinkedList<int []> result = new LinkedList<>();
		
		for(int i=0; i<s.length(); i++) {
			if(data[i] =='(') {
				index.add(i);
				stack.add(data[i]);
			}else if(data[i] ==')') {
				if(stack.peek() != '(' || stack.empty()) {
					System.out.println("잘못된 입력");
					break;
				}
				int x = index.pop();
				result.add(new int[] {x, i});
			}
		}
//		for(int i=0; i<result.size(); i++) {
//			System.out.println(result.get(i)[0] + " " + result.get(i)[1]);
//		}
		
		// 조합
		boolean[] visited = new boolean[result.size()];
		for(int r = 1; r <= result.size(); r++) {
			System.out.println("\n" + result.size() + "개 중에 " + r  + "개 뽑음");
	        comb(result, visited, 0, result.size(), r);
	        }
		
		

	}
}
