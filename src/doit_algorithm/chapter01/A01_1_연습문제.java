package doit_algorithm.chapter01;

public class A01_1_연습문제 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		
		return min;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(max4(1,3,5,8));
		System.out.println(min3(3,5,8));
		System.out.println(min4(1,3,5,8));
	}
}
