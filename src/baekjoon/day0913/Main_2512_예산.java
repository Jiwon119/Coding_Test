package baekjoon.day0913;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2512_예산 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] data = new int[N];
		long sum = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			data[i] = Integer.parseInt(st.nextToken());
			sum += data[i];
		}
		int M = Integer.parseInt(br.readLine());

		Arrays.sort(data);
		
		long result = 0;
		
		if(sum <= M) {
			System.out.println(data[N-1]);
		}else {
			long tempResult = M/N;
			while(true) {
				long tempSum = 0;
				for (int i = 0; i < N; i++) {
					if(data[i] >= tempResult) {
						tempSum = tempSum + (tempResult * (N-i));
						break;
					}else {
						tempSum += data[i];
					}
				}
				if(tempSum > M) break;
				
				if(result < tempResult) result = tempResult;
				tempResult++;
			}
			System.out.println(result);
		}
	}
}
