package swea.problem.first;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int[][] data = new int[N][N];
            for(int i=0; i<N; i++){
           		for(int j=0; j<N; j++){
                    data[i][j] = sc.nextInt();
                }    
            }
            String[] rotation90 = new String[N];
            String[] rotation180 = new String[N];
            String[] rotation270 = new String[N];
            
            for(int i=0; i<N; i++){
            	String result90 = "";
            	String result180 = "";
            	String result270 = "";
            	for(int j=0; j<N; j++){
            		result90 += data[N-j-1][i];
            		result180 += data[N-i-1][N-j-1];
            		result270 += data[j][N-i-1];
            	}
            	rotation90[i] = result90;
            	rotation180[i] = result180;
            	rotation270[i] = result270;
            }
            System.out.println("#"+test_case);
            for(int i=0; i<N; i++) {
            	System.out.println(rotation90[i] + " " + rotation180[i] + " " + rotation270[i]);
            }
		}
	}
}