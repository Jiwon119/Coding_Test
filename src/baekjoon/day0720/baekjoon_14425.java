package baekjoon.day0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjoon_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			map.put(bf.readLine(), i);
		}
		
		int cnt = 0;
		for(int i=0; i<m; i++) {
			String s = bf.readLine();
			if(map.containsKey(s)) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}