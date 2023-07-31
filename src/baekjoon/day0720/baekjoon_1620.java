package baekjoon.day0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjoon_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer token = new StringTokenizer(s);
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		
		HashMap<Integer, String> map = new HashMap<>();
		HashMap<String, Integer> mapValuse = new HashMap<>();
		for (int i=0; i<n; i++) {
			String name = bf.readLine();
			map.put(i, name);
			mapValuse.put(name, i);
		}

		for(int i=0; i<m; i++) {
			String input = bf.readLine();
			if(input.charAt(0) >= 65 && input.charAt(0) <= 122) {
				System.out.println(mapValuse.get(input)+1);
			}else {
				System.out.println(map.get(Integer.parseInt(input)-1));
			}
		}

	}
}