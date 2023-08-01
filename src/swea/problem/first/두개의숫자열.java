package swea.problem.first;

import java.util.Arrays;
import java.util.Scanner;

public class 두개의숫자열 {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			int T;
			T=sc.nextInt();
	        
			for(int test_case = 1; test_case <= T; test_case++)
			{
	            int n = sc.nextInt();
	            int m = sc.nextInt();
	            
	            int[][] data = new int[n][n];
	            int[] resultPlus = new int[n*n];
	            int[] resultX = new int[n*n];
	            
	            for (int i=0; i<n; i++){
	                for (int j=0; j<n; j++) {
	                    data[i][j] = sc.nextInt();
	                }
	            }
	            // +
	            int index = 0;
	            for (int i=0; i<n; i++){
	                // 1: 좌, 2:우, 3:상, 4:하
	                for (int j=0; j<n; j++) {
	                    int x1=0, x2=0, x3=0, x4=0;
	                    int y1=0, y2=0, y3=0, y4=0;
	                    int sum = 0;
	                    for (int z=1; z<m; z++){
	                        x1 = i; y1 = j-z;
	                        x2 = i;	y2 = j+z;
	                        x3 = i-z; y3 = j;
	                        x4 = i+z; y4 = j;
	                        
	                        if(x1 < n && x1 >= 0 && y1 < n && y1 >= 0){
	                            sum += data[x1][y1];
	                        }
	                        if(x2 < n && x2 >= 0 && y2 < n && y2 >= 0){
	                            sum += data[x2][y2];
	                        }
	                        if(x3 < n && x3 >= 0 && y3 < n && y3 >= 0){
	                            sum += data[x3][y3];
	                        }
	                        if(x4 < n && x4 >= 0 && y4 < n && y4 >= 0){
	                            sum += data[x4][y4];
	                        }
	                    }
	                    resultPlus[index] = sum + data[i][
	                                                      j];
	                    index++;
	                }
	            }
	            // X
	            index = 0;
	            for (int i=0; i<n; i++){
	                // 1: 북동, 2:남동, 3:남서, 4:북서
	                for (int j=0; j<n; j++) {
	                    int x1=0, x2=0, x3=0, x4=0;
	                    int y1=0, y2=0, y3=0, y4=0;
	                    int sum = 0;
	                    for (int z=1; z<m; z++){
	                        x1 = i-z; y1 = j+z;
	                        x2 = i+z; y2 = j+z;
	                        x3 = i+z; y3 = j-z;
	                        x4 = i-z; y4 = j-z;
	                        
	                        if(x1 < n && x1 >= 0 && y1 < n && y1 >= 0){
	                            sum += data[x1][y1];
	                        }
	                        if(x2 < n && x2 >= 0 && y2 < n && y2 >= 0){
	                            sum += data[x2][y2];
	                        }
	                        if(x3 < n && x3 >= 0 && y3 < n && y3 >= 0){
	                            sum += data[x3][y3];
	                        }
	                        if(x4 < n && x4 >= 0 && y4 < n && y4 >= 0){
	                            sum += data[x4][y4];
	                        }
	                    }
	                    resultX[index] = sum + data[i][j];
	                    index++;
	                }
	            }
	            
	            Arrays.sort(resultX);
	            Arrays.sort(resultPlus);
	            if (resultPlus[n*n-1] > resultX[n*n-1]) {
	            	System.out.println("#"+test_case+" "+resultPlus[n*n-1]);
	            } else {
	            	System.out.println("#"+test_case+" "+resultX[n*n-1]);
	            }
			}
		}
	}
}