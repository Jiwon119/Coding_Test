package baekjoon.day0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10:30 - 11:53
public class baekjoon_2477 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); 
		StringTokenizer token;
		int[] data = new int[6];
		
		int maxX = 0;
		int maxY = 0;
		int maxXIdx = 0, maxYIdx=0;
		
		for(int i=0; i<6; i++) {
			token = new StringTokenizer(bf.readLine());
			int dir = Integer.parseInt(token.nextToken());
			int num = Integer.parseInt(token.nextToken());
			
			if( dir == 1 || dir == 2) {
				data[i] = num;
				if( maxX < num ) {
					maxXIdx = i;
					maxX = num;
				}
			}else {
				data[i] = num;
				if( maxY < num ) {
					maxYIdx = i;
					maxY = num;
				}
			}
		}
		
		int x = 0;
		int y = 0;

		if(maxXIdx == 0 && maxYIdx == 5) {
			x = maxXIdx+1;
			y = maxYIdx-1;
		}else if(maxYIdx == 0 && maxXIdx == 5) {
			x = maxXIdx-1;
			y = maxYIdx+1;
		}
		else if(maxXIdx > maxYIdx) {
			x = maxXIdx+1 > 5 ? 0: maxXIdx+1;
			y = maxYIdx-1 < 0 ? 5 : maxYIdx-1;
		}else {
			x = maxXIdx-1 < 0 ? 5: maxXIdx-1;
			y = maxYIdx+1 > 5 ? 0 : maxYIdx+1;
		}
		
		int result = ((maxX * maxY) - (maxX-data[y])*(maxY-data[x]))*n;
		System.out.println(result);
	}
}


