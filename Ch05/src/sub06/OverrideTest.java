package sub06;
/*
 * 날짜: 2023/06/21
 * 이름: 최동일
 * 내용: JAVA Override 실습하기
 */
/*
 * 오버라이드(메서드 재정의)
 * -부모클래스의 메서드를 자식클래스에서 재정의하는 문법
 * -오버라이드를 통해서 객체지향 프로그래밍인 다형성을 구현
 */

class AAA{

	public void method1() {
		System.out.println("AAA: method1...");
	}
	
	public void method2() {
		System.out.println("AAA: method2...");
	}

	//오버로드
	public void method3() {
		System.out.println("AAA: method3...");
	}

}

class BBB extends AAA{
	
	@Override
	public void method2() {
		System.out.println("BBB: method2...");
	}

	//오버로드
	public void method3(int a) {
		System.out.println("BBB: method3...");
	}
}

class CCC extends BBB{
	
	@Override//오버라이드를 하게 되면 표시해준다.
	public void method1() {
		System.out.println("CCC: method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC: method2...");
	}

	//오버로드
	public void method3(int a, int b) {
		System.out.println("CCC: method3...");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		
		//오버라이드 메서드 호출
		CCC c =new CCC();
		
		c.method1();
		c.method2();
		//부모의 매서드와 자식의 메서드가 겹치면 자식의 메서드가 우선
		c.method3();
		//()안에 아무 값이 없어서 부모 클래스인 bbb로 매서드를 찾아서 가는데,
		//BBB method3를 사용할 수 없어서 상위 부모인 AAA에게로 간다.
		//AAA에서는 method3()을 사용할 수 있어서 출력한다.
		c.method3(1);
		//위의 메서드는 c에 입력이 되어있지 않으므로 부모 메서드에서 찾아본다.
		c.method3(1, 2);
		
		
/*
 * 강사님 설명
 * 1.c로 객체를 생성//new를 함으로써 heap에 AAA-BBB-CCC가 하나의 객체로 생성됨.
 * 2. c.method1();를하게 되면 CCC의 method1이 출력됨.	
 * 3.method3은 매개변수로 구분이 되므로 오버라이드가 아니라 오버로드	
 */
		
	//Car상속개체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고","남색", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedUp(80);
		bongo.show();
		
		
	}
}
