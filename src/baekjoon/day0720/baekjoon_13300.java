package baekjoon.day0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 09:41 - 10:00
public class baekjoon_13300 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		
		token = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		
		HashMap<Integer, int[]> data = new HashMap<Integer, int[]>();

		int room = 0;
	
		for (int i=0; i<n; i++){
			token = new StringTokenizer(bf.readLine());
			int gender = Integer.parseInt(token.nextToken());
			int grade = Integer.parseInt(token.nextToken());
			
			if(!data.containsKey(grade)) {
				data.put(grade, new int[2]);
			}
			
			data.get(grade)[gender]++;
			if(data.get(grade)[gender] % k == 1) {
				room++;
			}
		}
		System.out.println(room);
		
	}
}
