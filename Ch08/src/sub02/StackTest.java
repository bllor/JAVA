package sub02;

import java.util.Stack;

/*
 * 날짜: 2023/06/28
 * 이름: 최동일
 * 내용: Java 자료구조 Stack 실습하기
 */
/*
 * 스택(Stack)
 * - 스택은 데이터가 순서대로 쌓이는 자료구조(후입선출:LIFO)
 * - 변수 선언과 메서드 실행에 사용
 * 
 */
public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();  //<>제네릭은 객체만 사용할 수 있으므로 Wrapper클래스 사용.
	
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
	
		while(!stack.empty()) {//스텍이 비어있지 않으면 출력
			System.out.println("stack pop : "+stack.pop());
		}
		
//		System.out.println("stack pop : "+stack.pop());
//		System.out.println("stack pop : "+stack.pop());
//		System.out.println("stack pop : "+stack.pop());
//		System.out.println("stack pop : "+stack.pop());
//		System.out.println("stack pop : "+stack.pop());
	
	}
}
