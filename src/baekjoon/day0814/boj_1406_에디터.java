package baekjoon.day0814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 시간초과i
public class boj_1406_에디터 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer tk;
		
		char[] str = br.readLine().toCharArray();
		LinkedList<Character> strList = new LinkedList<Character>();
		
		for (int i = 0; i < str.length; i++) {
			strList.add(str[i]);
		}
		
		int M = Integer.parseInt(br.readLine());
		int cursor = strList.size();
		for (int i = 0; i < M; i++) {
			tk = new StringTokenizer(br.readLine());
			String temp = tk.nextToken();
			if(temp.equals("L") && cursor>0) {
				 cursor--;
			}else if(temp.equals("D") && cursor<strList.size()) {
				cursor++;
			}else if(temp.equals("B") && cursor>0) {
				strList.remove(--cursor);
			}else if(temp.equals("P")) {
				char s = tk.nextToken().charAt(0);
				strList.add(cursor++, s);
			}	
		}
		for (int i = 0; i < strList.size(); i++) {
			sb.append(strList.get(i));
		}	
		System.out.println(sb);
	}
}
