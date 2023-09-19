package baekjoon.day0913;

import java.util.Scanner;

public class Main_17626_FourSquares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			
			int memo[][] = new int[N+1][2];
			
			memo[0] = new int[] {1,1};
			memo[1] = new int[] {1,1};
			memo[2] = new int[] {1,2};
			
			for (int i = 3; i <= N; i++) {
				if(i == Math.pow(memo[i-1][0]+1, 2)) {
					memo[i] = new int[] {memo[i-1][0]+1, 1};
				}else {
					int tmp = (int) Math.pow(memo[i-1][0], 2);
					
					
					memo[i] = new int[] {memo[i-1][0], Math.min(memo[i-tmp][1]+1, memo[i-1][1]+1)};
				}
			}
			System.out.println(memo[N][1]);
		}
		
		
	}
}
//30	3
//31	4
//33	3	
//34	2
//35	3
//36	1
//37	2
//38	3
//39	4
//40	2
//50	2
//60	4
//70	3
//80	2
//90	
//100	
//3  4  3  2  3  1  2  3  4  2  2  4  3  2  2  1  
