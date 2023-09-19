package baekjoon.day0913;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS {
	
	public static int N, M, V;
	public static LinkedList<Integer>[] graph;
	public static boolean visited[];
	public static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		graph = new LinkedList[N+1];		
		visited = new boolean[N+1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new LinkedList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a].add(b);
			graph[b].add(a);
		}
		for (int i = 1; i <= N; i++) {
			graph[i].sort((o1, o2) -> o1-o2);
		}
		
		visited[V] = true;
		dfs(0,V);
		sb.append('\n');
		
		visited = new boolean[N+1];
		bfs();
		
		System.out.println(sb);
	}
	
	public static void dfs(int depth, int node) {
		if(depth == N) {
			System.out.println();
			return;
		}
		
		sb.append(node).append(" ");
		
		for (int i = 0; i < graph[node].size(); i++) {
			int cur = graph[node].get(i);
			if(!visited[cur]) {
				visited[cur] = true;
				dfs(depth+1, cur);
			}
		}
	}

	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(V);
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			
			if(visited[node]) continue;
			
			visited[node] = true;
			sb.append(node + " ");
			
			for (int i = 0; i < graph[node].size(); i++) {
				int cur = graph[node].get(i);
				if(!visited[cur]) {
					queue.add(cur);
				}
			}
		}
	}
}
