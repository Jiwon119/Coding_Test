package doit_algorithm.chapter01;

import java.util.Scanner;

public class A01_2_세값의중앙값 {
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) return b;
			else {
				if(a > c) return c;
				else return a;
			}
		}else {
			if(a >= c) return a;
			else{
				if(c >= b) return b;
				else return c;
			}
		}
		
		
	}	 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : "); int a = sc.nextInt();
		System.out.println("b의 값 : "); int b = sc.nextInt();
		System.out.println("c의 값 : "); int c = sc.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		
		// Q4
		System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a
	}

}
