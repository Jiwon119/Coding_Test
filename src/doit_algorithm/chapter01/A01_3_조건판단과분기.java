package doit_algorithm.chapter01;

import java.util.Scanner;

public class A01_3_조건판단과분기 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);		
			
			System.out.print("정수를 입력하세요.:"); int num = sc.nextInt();
			if(num > 0)
				System.out.println("이 수는 양수입니다.");
			else if (num < 0)
				System.out.println("이 수는 음수입니다.");
			else
				System.out.println("이 수는 0입니다.");
		}
	}
}
