package baekjoon.day0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 1966. 프린터 큐 - Queue
// hashMap + Queue
//메모리 14768kb		시간 148ms
public class baekjoon_1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(bf.readLine());
		
		for (int i=0; i<test_case; i++) {
			String nm = bf.readLine();
			StringTokenizer token = new StringTokenizer(nm);
			int n = Integer.parseInt(token.nextToken());
			int m = Integer.parseInt(token.nextToken());
			
			
			Queue<int[]> queue = new LinkedList<int[]>();

			String numList = bf.readLine();
			StringTokenizer numToken = new StringTokenizer(numList);
			Integer[] weight = new Integer[n];
			
			for(int j=0; j<n; j++) {
				int [] data = new int[2];
				weight[j] =  Integer.parseInt(numToken.nextToken());
				data[0] = j;
				data[1] = weight[j];
				queue.add(data);
			}
			
			Arrays.sort(weight, Collections.reverseOrder());
			int index = 0;
			int cnt = 0;
			while(!queue.isEmpty()) {
				if(weight[index] == queue.peek()[1]) {
					cnt++;
					if(queue.peek()[0] == m) {
						break;
					}
					queue.remove();
					index++;
				}else {
					int[] backData = queue.peek();
					queue.remove();
					queue.add(backData);
				}
			}
			System.out.println(cnt);
		}
	}
}
