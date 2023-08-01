package swea.problem.first;

import java.util.Arrays;
import java.util.Scanner;

public class 스도쿠검증2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++ ) {
			int[][] data = new int[9][9];
			int[] row = new int[9];
			int[] col = new int[9];
			int result = 1;
			
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					data[i][j] = sc.nextInt();
				}
			}
			//가로 체크
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					
				}
			}
		}
	}
}