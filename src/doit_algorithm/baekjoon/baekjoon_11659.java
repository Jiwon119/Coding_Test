package doit_algorithm.baekjoon;

import java.util.Scanner;

public class baekjoon_11659 {

	public static void main(String[] args) {
		
/*		//내가 구한건데 시간 복잡도를 넘어감... 합배열을 이용한 구간합을 이용해야함
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] numlist = new int[n];
		for (int i = 0; i < n; i++)
			numlist[i] = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int sum = 0;
			for (int j = start; j <= end; j++)
				sum += numlist[j-1];
			System.out.println(sum);
*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[n]; // 이건 합배열
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += sc.nextInt();
			s[i] = sum;
		}
		
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			if (start-2 < 0)
				System.out.println(s[end-1]);
			else
				System.out.println(s[end-1]-s[start-2]);
		}
	}
}

