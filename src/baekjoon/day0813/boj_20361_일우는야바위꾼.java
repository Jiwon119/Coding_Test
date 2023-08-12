package baekjoon.day0813;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_20361_일우는야바위꾼 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		
		tk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tk.nextToken());	// 컵의 수
		int X = Integer.parseInt(tk.nextToken());	// 처음 공의 위치
		int K = Integer.parseInt(tk.nextToken());	// 컵을 움직이는 횟수
		
		for (int i = 0; i < K; i++) {
			tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			
			if(a == X) X = b;
			else if(b == X) X = a;
		}
		System.out.println(X);
	}
}

/**
 * 기존 문제 풀이 - 배열을 이용해서 풀이
 * 배열을 이용하여 값의 위치를 바꿔주는 식으로 풀이했지만
 * 솔루션을 찾아서 다시 풀어본 결과 배열을 사용하지 않아도
 * 기존의 위치와 입력된 위치중 하나와 같다면
 * 입력된 또 다른 위치를 결과값으로 갱신해주는 식으로 풀이
 * 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		
		tk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tk.nextToken());	// 컵의 수
		int X = Integer.parseInt(tk.nextToken());	// 처음 공의 위치
		int K = Integer.parseInt(tk.nextToken());	// 컵을 움직이는 횟수
		
		int data[] = new int[N+1];
		data[X] = 1;
		
		for (int i = 0; i < K; i++) {
			tk = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(tk.nextToken());
			int second = Integer.parseInt(tk.nextToken());
			
			int temp = data[first];
			data[first] = data[second];
			data[second] = temp;
		}
		for (int i = 0; i < data.length; i++) {
			if(data[i] == 1) {
				System.out.println(i);
			}
		}
	}
}

 * */
