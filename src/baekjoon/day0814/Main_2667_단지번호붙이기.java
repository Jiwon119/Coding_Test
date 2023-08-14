package baekjoon.day0814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main_2667_단지번호붙이기 {
	private static int N, data[][], cnt, numCnt;
	private static Queue<int[]> queue = new LinkedList<int[]>();
	private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	static int[] X = {0,0,1,-1};
	static int[] Y = {-1,1,0,0};
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		data = new int[N][N];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				data[i][j] = str.charAt(j)-'0';
			}
		}
		
		cnt = 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(data[i][j] == 1) {
					bfs(i, j, ++cnt);
					map.put(cnt, numCnt);
					numCnt = 0;
				}
			}
		}
		Object[] NumList = map.values().toArray();
		Arrays.sort(NumList);
		
		System.out.println(cnt-1);
		for (Object num : NumList) {
			System.out.println(num);
		}
		
		
	}
	public static void bfs(int x, int y, int num) {
		queue.add(new int[] {x, y});
		data[x][y] = num;
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			numCnt++;
			
			for (int i = 0; i < 4; i++) {
				int dx = temp[0] + X[i];
				int dy = temp[1] + Y[i];
				
				if(dx<0 || dx>=N || dy<0 || dy>=N) continue;
				if(data[dx][dy] != 1) continue;
					
				queue.add(new int[] {dx, dy});
				data[dx][dy] = num;

			}
		}

	}
}
