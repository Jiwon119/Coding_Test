package swea.problem.first;

import java.util.Scanner;

public class 홀수만더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int result = 0;
            for(int i = 0; i < 10; i++){
                int num = sc.nextInt();
                if(num % 2 == 1)
                    result += num;
            }
            System.out.printf("#%d %d\n", test_case, result);
		}
	}
	
}
