package swea.problem.first;

import java.util.Scanner;

public class 최대수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		num=sc.next();
		
		char[] numlist = num.toCharArray();
		int result = 0;
		for (char n : numlist) {
			result += n - '0';
		}
		System.out.println(result);

	}
}
