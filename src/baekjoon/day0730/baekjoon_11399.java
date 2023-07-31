package baekjoon.day0730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] data = new int[N];
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			data[i] = Integer.parseInt(token.nextToken());
		}
		
		Arrays.sort(data);
		int sum=0;
		for (int i = 0; i < N; i++) {
			sum += data[i]*(N-i);
		}
		System.out.println(sum);
		
	}
}
