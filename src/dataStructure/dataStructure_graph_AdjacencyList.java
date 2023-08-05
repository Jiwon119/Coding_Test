package dataStructure;

import java.util.ArrayList;

public class dataStructure_graph_AdjacencyList {
	
	public static void main(String[] args) {
		int n = 5;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

		//각 노드 별 리스트 생성
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>()); 
        
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 4);
		addEdge(graph, 1, 5);
		addEdge(graph, 2, 3);
		addEdge(graph, 2, 4);
		addEdge(graph, 4, 5);
		
		for (int i = 1; i < n+1; i++) {
			System.out.printf("node[%d] : ", i);
			for (int j = 0; j < graph.get(i).size(); j++) {
				System.out.print(graph.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}	
	
	// 정점을 추가해주는 함수
	public static void addEdge(ArrayList<ArrayList<Integer>> graph, int x, int y) {
		graph.get(x).add(y);
		graph.get(y).add(x);
	}
}
