package baekjoon.day0716;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * 1:45-1:58 (15분) 
 * 2164. 카드2 - 덱(Deque) 활용
 * Deque(Double Ended Queue) : 양쪽에 데이터를 넣고 뺄 수 잇는 자료구조.
 * 큐(Queue) + 스택(Stack)
 * 메모리 56848kb		시간 296ms
 * */

public class baekjoon_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Deque<Integer> deque = new LinkedList<Integer>();
		for (int i=1; i<=n; i++) {
			deque.add(i);
		}
		while (deque.size() > 1) {
			deque.removeFirst();
			int num = deque.peekFirst();
			deque.removeFirst();
			deque.addLast(num);
		}
		System.out.println(deque.peek());
	}

}
