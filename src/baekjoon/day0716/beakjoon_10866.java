package baekjoon.day0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 10866. 덱
// 3:30-3:44 (15분)
//메모리 19184kb		시간 196ms
public class beakjoon_10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		
		for (int i=0; i<num; i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			switch(st.nextToken()) {
			case("push_front"):
				int frontX = Integer.parseInt(st.nextToken());
				deque.addFirst(frontX);
				break;
			case("push_back"):
				int backX = Integer.parseInt(st.nextToken());
				deque.addLast(backX);
				break;
			case("pop_front"):
				Integer popFront = deque.pollFirst();
				if(popFront == null) sb.append(-1).append('\n');
				else sb.append(popFront).append('\n');
				break;
			case("pop_back"):
				Integer popBack = deque.pollLast();
				if(popBack == null) sb.append(-1).append('\n');
				else sb.append(popBack).append('\n');
				break;
			case("size"):
				sb.append(deque.size()).append('\n');
				break;
			case("empty"):
				if(deque.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case("front"):
				if(deque.isEmpty()) sb.append(-1).append('\n');
				else sb.append(deque.getFirst()).append('\n');
				break;
			case("back"):
				if(deque.isEmpty()) sb.append(-1).append('\n');
				else sb.append(deque.getLast()).append('\n');
				break;
			}
					
		}
		System.out.println(sb);
	}
}
