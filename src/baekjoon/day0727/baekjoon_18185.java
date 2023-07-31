package baekjoon.day0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_18185 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		
		int N = Integer.parseInt(br.readLine());
		int[] data = new int[N];
		
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			data[i] = Integer.parseInt(token.nextToken());
		}
		
		int coin = 0;
		for (int i = 0; i < N; i++) {
			int idx = i;
			int idxP = (i+1 < N) ? i+1 : -1;
			int idxPP = (i+2 < N) ? i+2 : -1;
			
			while(data[idx] > 0) {
				if(idxPP != -1 && data[idx] > 0
						&& data[idxP] > 0 && data[idxPP] > 0
						&& (data[idxP] <= data[idxPP])){
						coin += 7;
						data[idx]--;
						data[idxP]--;
						data[idxPP]--;
					} else if(idxP != -1 && data[idx] > 0 && data[idxP] > 0) {
						coin += 5;
						data[idx]--;
						data[idxP]--;
					} else if(data[idx] > 0) {
						coin += 3;
						data[idx]--;
					}
			}
		}
		System.out.println(coin);
	}
}
