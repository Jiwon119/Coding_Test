package baekjoon.day0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 9012_괄호 - stack 활용 X
// 9:56-10:15 (25분)
public class baekjoon_9012 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<test_case; i++) {
			String result = "YES";
			int curX = 0;
			int curY = 0;
			
			String[] data = bf.readLine().split("");
			for (String s:data) {
				if(s.equals("(")) {
					curX++;
				} else{
					curY++;
					if(curY > curX) {
						result = "NO";
						break;
					}
				}
			}
			if(curX != curY) result = "NO";
			System.out.println(result);
		}
	}
}
