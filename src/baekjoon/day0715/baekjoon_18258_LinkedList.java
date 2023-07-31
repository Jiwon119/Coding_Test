package baekjoon.day0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 18258. Queue - Linked List 이용
public class baekjoon_18258_LinkedList {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> queue = new LinkedList<Integer>();
		
		
		int N = Integer.parseInt(bf.readLine());

		
		for (int i=0; i<N; i++) {
			String command = bf.readLine();
			StringTokenizer token = new StringTokenizer(command);
			switch(token.nextToken()) {
			case("push"):
				//offer()함수는 큐의 맨 뒤에 요소를 추가한다.
				queue.offer(Integer.parseInt(token.nextToken()));
				break;
			case("pop"):
				/*
				 * poll()은 가장 앞에 있는 요소를 삭제하고,
				 * 삭제할 요소가 없는 경우 null반환
				 * Integer -> Unboxing하지 않을 시 산술 연산이 불가능, null 처리 가능
				 * int	   -> 산술 연산 가능, null 처리 불가능
				 * */
				Integer num = queue.poll();
				if(num == null) sb.append(-1).append('\n');	
				else sb.append(num).append('\n');		
				break;
			case("size"):
				sb.append(queue.size()).append('\n');	
				break;
			case("empty"):
				sb.append(queue.isEmpty()?1:0).append('\n');	
				break;
			case("front"):
				//peek()함수는 처음 요소를 반환. 꺼낼 요소가 없는 경우 null
				Integer frontNum = queue.peek();
				if(frontNum == null) sb.append(-1).append('\n');
				else sb.append(frontNum).append('\n');
				break;
			case("back"):
				//peek()함수는 마지막 요소를 반환. 꺼낼 요소가 없는 경우 null
				Integer lastNum = queue.peekLast();
				if(lastNum == null) sb.append(-1).append('\n');
				else sb.append(lastNum).append('\n');	
				break;
			}
		}
		System.out.println(sb);
	}
}
