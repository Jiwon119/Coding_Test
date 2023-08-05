package baekjoon.day0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
DFS와 BFS

그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 */

public class baekjoon_1260 {
	static int n, m, v;
	static int[] dfsArr, bfsArr;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
	
	public static void dfs(int num, int curIdx) {
		if(curIdx == n) {
			
			return;
		}
		

		
		
	}
	
	public static void bfs() {
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		n = Integer.parseInt(tk.nextToken());
		m = Integer.parseInt(tk.nextToken());
		v = Integer.parseInt(tk.nextToken());
		
//		HashMap<Integer, V>
//		int[][] data = new int[m][2];
		dfsArr = new int[n];
		bfsArr = new int[n];
		visited = new boolean[m];
		
		data.add(0, null);
		for (int i = 0; i < 5; i++) {
			tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			

		}

		
	}
}
