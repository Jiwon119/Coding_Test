package baekjoon.day0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2875 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer token = new StringTokenizer(s);
		
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		
		int result = 0;
		
		
		while( n+m >= k+3 && n >= 2 && m >= 1) {
			result++;
			n -= 2;
			m--;
		}
		
		System.out.println(result);

	}
}
