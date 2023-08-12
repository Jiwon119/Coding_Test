package baekjoon.day0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
DFS와 BFS

그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 */

public class baekjoon_1260_2 {
	static int node, line, start;
	static int[][] arr;
	static boolean[] visited;
	
	static ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
	static Queue<Integer> queue = new LinkedList<Integer>();
	static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int num) {
		visited[num] = true;
		sb.append(num + " ");
		
		for (int i = 0; i <= node; i++) {
			if(arr[start][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int num, int curIdx) {
		
//		if(curIdx == n-1 || curIdx == m) {
//			for (int i = 0; i < curIdx+1; i++) {
//				sb.append(bfsArr[i] + " ");
//			}
//			return;
//		}
//		
//		if(!visited[num]) {
//			bfsArr[curIdx] = num;
//			visited[num] = true;
//		}
//
//		
//		data.get(num).sort(null);
//		for (int i = 0; i < data.get(num).size(); i++) {
//			if(!visited[data.get(num).get(i)]) {
//				int temp = data.get(num).get(i);
//				curIdx++;
//				visited[temp] = true;
//				bfsArr[curIdx] = temp;
////				bfsArr.add(curIdx, temp);
//				queue.add(temp);
//			}
//		}
//		if (!queue.isEmpty()) {
//			bfs(queue.poll(), curIdx);
//		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		node = Integer.parseInt(tk.nextToken());
		line = Integer.parseInt(tk.nextToken());
		start = Integer.parseInt(tk.nextToken());
		
//		HashMap<Integer, V>
//		int[][] data = new int[m][2];
		arr = new int[node+1][node+1];
		visited = new boolean[node+1];

		for (int i = 0; i < line; i++) {
			tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		dfs(start);
		visited = new boolean[node+1];
		bfs(start,0);
		System.out.println(sb);
	}
}

