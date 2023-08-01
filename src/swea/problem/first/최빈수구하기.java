package swea.problem.first;

import java.util.Arrays;
import java.util.Scanner;

public class 최빈수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int testNum = sc.nextInt();
            int[] data = new int[1000];
            for (int i =0; i<1000; i++){
            	data[i] = sc.nextInt();
            }
            Arrays.sort(data);
            int result = 0;
            int max = 0;
            int curNum = data[0];
            int curCount = 0;
            for (int i =0; i<1000; i++){
            	if(curNum == data[i]){
            		curCount++;
                }else{
                    curNum = data[i];
                	curCount = 0;
                }
                if(curCount >= max){
                	max = curCount;
                	result = data[i];
                }
            }
            System.out.println(result);
		}
	}
}