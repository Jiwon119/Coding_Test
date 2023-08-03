package baekjoon.day0802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_15650 {
	
	static int[] arr;
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	
	public static void func(int start, int curIdx) {
		if(curIdx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for (int i = start; i <= n; i++) {
			arr[curIdx] = i;
			func(i+1, curIdx+1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		n = Integer.parseInt(token.nextToken());	// 1부터 N까지 자연수
		m = Integer.parseInt(token.nextToken());	// 길이
		
		arr = new int[m];
		
		func(1, 0);
		System.out.println(sb);
	}
}
