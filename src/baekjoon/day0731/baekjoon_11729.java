package baekjoon.day0731;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11729 {
	// arr[0]:-1  arr[1]:0  arr[2]:1
	static int[] arr = new int[3];
	static int[][] data;
	
	public static void func(int row, int col, int size) {
		if(check(row, col, size)) {
			arr[data[row][col]+1]++;
			return;
		}
		
		func(row, col, size/3);
		func(row, col + size/3, size/3);
		func(row, col + size*2/3, size/3);
		
		func(row + size/3, col, size/3);
		func(row + size/3, col + size/3, size/3);
		func(row + size/3, col + size*2/3, size/3);
		
		func(row + size*2/3, col, size/3);
		func(row + size*2/3, col + size/3, size/3);
		func(row + size*2/3, col + size*2/3, size/3);
		
	}
	
	public static boolean check(int row, int col, int size) {
		int curNum = data[row][col];
		
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if(data[i][j] != curNum) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		data = new int[N][N];
		
		StringTokenizer token;
		
		for (int i = 0; i < N; i++) {
			token = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				data[i][j] = Integer.parseInt(token.nextToken());
			}
		}

		func(0, 0, N);
		
		
		for (int result : arr) {
			System.out.println(result);
		}
	}
}
 