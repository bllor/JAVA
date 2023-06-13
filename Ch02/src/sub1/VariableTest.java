package sub1;

/*
 *날짜: 2023.6.12 
 *이름: 최동일
 *내용: Ch02.Java 연수와 연산자 실습
 *
 * 변수(Variable)
 * -데이트 처리를 위한 데이터 그릇
 * -변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 * 
 * 상수(constant)
 * -최초 저장된 데이터로 고정되는 변수
 * -대문자로 표기
 */
public class VariableTest {

	public static void main(String[] args) {
	//들여쓰기를 하는 이유는 가독성 때문		
	
	//변수
	int a = 3;
	int b= 7;//b에 7을 저장
	System.out.println("a: "+a);	
	a=5; // a의 값이 5로 변함
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	
	String name= "홍길동";
	System.out.println(name+"님 반갑습니다.");
	//상수 - 대문자로 표기하는 룰이 있다.
	final int NUM= 5;//num이라는 변수를 항상 5로 고정하는 방법
	
	//NUM=7; < 상수는 값이 변하지 않으므로 금방과 같은 식을 할 수 없다.
	System.out.println("NUM: "+NUM);
	}
}
