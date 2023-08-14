package baekjoon.day0814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_14502_연구소 {
	
	public static int N, M, arr[][], selectWall[][], result, cnt, resultArr[][];
	public static LinkedList<int[]> virus = new LinkedList<int[]>();
	public static LinkedList<int[]> wall = new LinkedList<int[]>();
	public static LinkedList<int[]> none = new LinkedList<int[]>();
	public static Queue<int[]> queue = new LinkedList<int[]>();
	public static int[] X = {0,1,0,-1};
	public static int[] Y = {1,0,-1,0};
	
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		
		tk = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tk.nextToken());
		M = Integer.parseInt(tk.nextToken());
		result = Integer.MAX_VALUE;
		
		arr = new int[N][M];
		selectWall = new int[3][2];
		
		// 데이터 입력
		for (int i = 0; i < N; i++) {
			tk = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(tk.nextToken());
				if(arr[i][j] == 2) {
					virus.add(new int[] {i, j});
				} else if(arr[i][j] == 1) {
					wall.add(new int[] {i, j});
				} else {
					none.add(new int[] {i, j});
				}
			}
		}
				
		comb(0,0);
		System.out.println(none.size() - result - 3);

	}
	
	public static void comb(int depth, int start) {
		if(depth == 3) {
			cnt=0;
			bfs();
			if(result > cnt) {
				result = cnt;
			}

			return;
		}
		for (int i = start; i < none.size(); i++) {
			selectWall[depth] = none.get(i);
			comb(depth+1, i+1);
		}
	}
	public static void bfs() {
		int[][] tempArr = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tempArr[i][j] = arr[i][j];
			}
		}
		for (int i = 0; i < selectWall.length; i++) {
			tempArr[selectWall[i][0]][selectWall[i][1]] = 1;
		}		
		
		for (int i = 0; i < virus.size(); i++) {
			queue.add(virus.get(i));			
			
			while(!queue.isEmpty()) {				
				int[] temp = queue.poll();
				
				for (int j = 0; j < 4; j++) {
					int x = temp[0] + X[j];
					int y = temp[1] + Y[j];
					
					if(x < 0 || x >= N || y < 0 || y >= M) {
						continue;
					}
					
					if(tempArr[x][y] == 0) {
						cnt++;
						tempArr[x][y] = 3;
						queue.add(new int[] {x, y});
					}
				}
			} // end while
		}
	}
}