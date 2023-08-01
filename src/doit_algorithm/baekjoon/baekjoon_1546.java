package doit_algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		
		int maxScore = -1;
		float sum = 0;
		
		for (int i = 0; i < N; i++) {
			int score = sc.nextInt();
			if (score > maxScore)
				maxScore = score;
			sum += score;
		}
		
		System.out.println(sum/maxScore*100.0/N);
	}
}
