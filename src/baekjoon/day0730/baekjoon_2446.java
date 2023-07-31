package baekjoon.day0730;

import java.util.Scanner;

public class baekjoon_2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num=-1;
		for (int i = 0; i < 2*N-1; i++) {
			if(i >= N) {
				num--;
			}else {
				num++;
			}
			for (int j = 0; j < num; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < 2*(N-num)-1; j++) {
				System.out.print('*');
			}

			System.out.println();
		}
	}
}
