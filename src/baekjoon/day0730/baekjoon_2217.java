package baekjoon.day0730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class baekjoon_2217 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] data = new Integer[N];
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(data, Collections.reverseOrder());
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if(data[i]*(i+1) > max) max = data[i]*(i+1);
		}

		System.out.println(max);

	}
}
