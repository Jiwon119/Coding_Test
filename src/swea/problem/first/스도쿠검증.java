package swea.problem.first;

import java.util.Arrays;
import java.util.Scanner;

public class 스도쿠검증 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		Loop1 : for (int test_case = 1; test_case <= T; test_case++ ) {
			int[][] data = new int[9][9];
	        int[] c = {0,0,0,0,0,0,0,0,0};
			for(int i=0; i<9; i++) {
				for (int j=0; j<9; j++) {
	                data[i][j] = sc.nextInt();
				}
			}
			int[] r = {0,0,0,0,0,0,0,0,0};
	        for(int i = 0; i < 9; i++){
	        	// 가로, 세로 체크
	        	for (int j=0; j<9; j++) {
	                if(c[data[j][i]-1] == 1 || r[data[i][j]-1] == 1) {
	                    System.out.println("#" + test_case + " " + 0);
	                    continue Loop1;
	                }
	                else{
	                    c[data[j][i]-1] = 1;
	                    r[data[i][j]-1] = 1;
	                }
	            }
	        	Arrays.fill(r, 0);
	        	Arrays.fill(c, 0);
	        }
	        
	        int x = 0;
	        int y = 0;
	        for(int i = 0; i < 9; i++){
	        	if ((i+1) % 3 == 1 && i != 0)
	        		x += 3;
	        	if (y > 8)
	        		y = 0;
	        	for (int a=x; a<(x+3); a++) {
	        		for (int b=y; b<(y+3); b++) {
		                if(c[data[a][b]-1] == 1) {
		                    System.out.println("#" + test_case + " " + 0);
		                    continue Loop1;
		                }
		                else{
		                	c[data[a][b]-1] = 1;
		                }
	        		}
	        	}
	        	y += 3;
	        	Arrays.fill(c, 0);
	        }
	        
	        System.out.println("#" + test_case + " " + 1);
	}
}
}