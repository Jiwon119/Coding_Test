package doit_algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11659_y {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferdReader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = 
				new StringTokenizer(bufferdReader.readLine());
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] S = new long[suNo + 1];
		
		stringTokenizer = 
				new StringTokenizer(bufferdReader.readLine());
		for(int i = 1; i <= suNo; i++) 
		{
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for(int q=0; q<quizNo; q++) 
		{
			stringTokenizer = 
					new StringTokenizer(bufferdReader.readLine());
			int start = Integer.parseInt(stringTokenizer.nextToken());
			int end = Integer.parseInt(stringTokenizer.nextToken());
			
			System.out.println(S[end]-S[start-1]);
		}
	}
}

