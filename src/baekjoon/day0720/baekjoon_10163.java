package baekjoon.day0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이
// 구현
public class baekjoon_10163 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		int n = Integer.parseInt(bf.readLine());
		
		int[][] data = new int[1001][1001];
		
		for(int i=1; i<=n; i++) {
			String s = bf.readLine();
			token = new StringTokenizer(s);
			int x = Integer.parseInt(token.nextToken());
			int y = Integer.parseInt(token.nextToken());
			int w = Integer.parseInt(token.nextToken());
			int h = Integer.parseInt(token.nextToken());
			
			for(int dx=x; dx<w+x; dx++) {
				for(int dy=y; dy<h+y; dy++) {
					data[dx][dy] = i;
				}
			}
		}
		int[] result = new int[n];
		for(int i=0; i<1001; i++) {
			for (int j=0; j<1001; j++) {
				if(data[i][j] != 0) {
					result[data[i][j]-1]++;
				}
			}
		}
		
		for(int r : result) {
			System.out.println(r);
		}
	}
}
