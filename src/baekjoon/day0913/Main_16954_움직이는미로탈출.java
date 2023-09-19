package baekjoon.day0913;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_16954_움직이는미로탈출 {
	
	public static int X[] = {0,0,0,1,-1,1,1,-1,-1};
	public static int Y[] = {0,1,-1,0,0,1,-1,1,-1};
	public static char map[][];
	public static int result;
	public static boolean visited[][];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		map = new char[8][8];
		visited = new boolean[8][8];
		result = 0;
		
		for (int i = 0; i < 8; i++) {
			map[i] = br.readLine().toCharArray();
		}

		dfs(7,0,0);
		System.out.println(result);
		
	}
	
	public static void dfs(int x, int y, int moveCnt) {
		if(result == 1) {
			return;
		}
		
		if(x == 7 && y == 7) {
			result = 1;
			return;
		}
		
		char[][] tempMap = mapSetting(moveCnt);
		
		if(tempMap[x][y] == '#') return;
		
		for (int i = 0; i < 9.; i++) {
			int dx = x + X[i];
			int dy = y + Y[i];
			
			
			if(check(dx, dy, tempMap)) {
				visited[dx][dy] = true;
				dfs(dx, dy, moveCnt+1);
				visited[dx][dy] = false;
			}
		}
	}
	public static char[][] mapSetting(int moveCnt) {
		if(moveCnt < 0) return map;
		
		char[][] tempMap = new char[8][8];
		
		if(moveCnt > 8) {
			for (int i = 0; i < 8; i++) {
				Arrays.fill(tempMap[i], '.');
			}
			return tempMap;
		}
		
		for (int i = 0; i < moveCnt; i++) {
			Arrays.fill(tempMap[i], '.');
		}
		
		for (int i = moveCnt; i < 8; i++) {
			tempMap[i] = map[i-moveCnt];
		}
		return tempMap;
	}
	
	
	public static boolean check(int x, int y, char[][] tempMap) {
		if(x < 0 || x >= 8 || y<0 || y >= 8 || tempMap[x][y] == '#' || visited[x][y]) {
			return false;
		}
		return true;
	}
}
