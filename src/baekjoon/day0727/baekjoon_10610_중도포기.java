package baekjoon.day0727;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class baekjoon_10610_중도포기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numStr = sc.next();
		char[] ch = numStr.toCharArray();
		int num = Integer.parseInt(numStr);
		
		int sum = 0;
		boolean check = false;
		for (char c : ch) {
			if(c == '0') check = true;
			sum += c - '0';
		}
		
		Arrays.sort(ch);
		ch = (new StringBuilder(new String(ch))).reverse().toString().toCharArray();
		
		
		
		
		System.out.println(String.valueOf(ch));
		if(sum % 3 == 0 && check) {
			for (int i = 0; i < ch.length; i++) {
				for (int j =0 ; j < ch.length; j++) {
					
				}
			}
			
			
		}else {
			System.out.println(-1);
		}
		
	
	}
}


/*
 * 
 * 
 * 		Scanner sc = new Scanner(System.in);
		String numStr = sc.next();
		Integer[] data = new Integer[numStr.length()];
		
		
		int sum = 0;
		boolean check = false;
		for (int i = 0; i < data.length; i++) {
			int n = numStr.charAt(i)-'0';
			data[i] = n;
			if(n == 0) check = true;
			sum += n;
		}		
		

		Arrays.sort(data, Collections.reverseOrder());
		System.out.println(data.toString());
		if(sum % 3 == 0 && check) {

		}else {
			System.out.println(-1);
		}*/
