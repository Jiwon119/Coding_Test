package dataStructure;

public class dataStructure_graph_AdjacencyMatrix {
	public static void main(String[] args) {
		//그래프 정점의 개수
		int n = 5;	
		
		// 정점의 번호와 맞추기 위해 0번 인덱스 사용 X
		int[][] graph = new int[n+1][n+1]; 
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 4);
		addEdge(graph, 1, 5);
		addEdge(graph, 2, 3);
		addEdge(graph, 2, 4);
		addEdge(graph, 4, 5);

		for (int i = 1; i < n+1; i++) {
			System.out.print("       ");
			for (int j = 1; j < n+1; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// 정점을 추가해주는 함수
	public static void addEdge(int[][] graph, int x, int y) {
		graph[x][y] = 1;
		graph[y][x] = 1;
	}
	
}
