package baekjoon.day0813;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2840_행운의바퀴 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		
		tk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tk.nextToken());
		int K = Integer.parseInt(tk.nextToken());
		
		char[] data = new char[N];
		Arrays.fill(data, '?');
		boolean check[] = new boolean[26];
		
		
		int idx = -1;
		for (int i = 0; i < K; i++) {
			tk = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(tk.nextToken());
			char ch = tk.nextToken().charAt(0);
			
			idx = (idx+num) % N;
			
			if (data[idx] == '?' && !check[ch-'A']) {
				data[idx] = ch;
				check[ch-'A'] = true;
			}else if(data[idx] == ch) {
				continue;
			}
			else {
				System.out.println('!');
				return;
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(data[idx % N]);
			idx = --idx < 0 ? idx+N : idx;
		}
	}
}
