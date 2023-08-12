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
	static ArrayList<Integer> dfsArr, bfsArr;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> data;
	
	public static void dfs(int num, int curIdx) {
		dfsArr.add(curIdx, num);
		visited[num] = true;
		
		if(curIdx == n-1 || curIdx == m) {
			System.out.println(dfsArr);
			return;
		}
		
		data.get(num).sort(null);
		for (int i = 0; i < data.get(num).size(); i++) {
			int temp = data.get(num).get(i);
			if(!visited[temp]) {
				dfs(temp, curIdx+1);
				break;
			}
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
		dfsArr = new ArrayList<Integer>();
		bfsArr = new ArrayList<Integer>();
		visited = new boolean[n+1];
		data = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < n+1; i++) {
			data.add(i, new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			data.get(a).add(b);
			data.get(b).add(a);
		}
		dfs(v,0);
		
	}
}
