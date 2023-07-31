package baekjoon.day0730;

import java.util.Scanner;

public class baekjoon_2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-i; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j <= 2*i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
