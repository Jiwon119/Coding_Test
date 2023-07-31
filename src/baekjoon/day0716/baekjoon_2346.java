package baekjoon.day0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//2346. 풍선 터뜨리기
//11:10 - 11:40 (30분)
//메모리 14432kb		시간 136ms

public class baekjoon_2346 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		
		
		String s = bf.readLine();
		StringTokenizer token = new StringTokenizer(s);
		
		LinkedList<int[]> data = new LinkedList<int[]>();
		
		for (int i=1; i<=n; i++) {
			int[] newData = {i, Integer.parseInt(token.nextToken())};
			data.add(newData);
		}
		
		int index = 0;

		while(!data.isEmpty()) {
			sb.append(data.get(index)[0]).append(' ');
			int move = data.get(index)[1];
			data.remove(index);
			index += (move>0?move-1: move);
			while(index < 0 || index >= data.size()) {
				if(data.size() == 0) break;
				if(index >= data.size()) {
					index -= data.size();
				}
				if(index < 0) {
					index += data.size();
				}
			}
		}
		System.out.println(sb);
	}

}
