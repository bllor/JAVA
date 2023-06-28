package sub02;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 날짜: 2023/06/28
 * 이름: 최동일
 * 내용: Java 자료구조 Queue 실습하기
 */
/*
 * 큐(Queue)
 * - 큐는 데이터가 차례대로 쌓이는 자료구조(선입선출:FIFO)
 * - 이벤트, 애니메이션 실행에 사횽
 */

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();//queue는 인터페이스라서 Linkedlist로 생성함
		
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
		
		
		
		
		
	}
}
