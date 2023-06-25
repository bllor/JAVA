package sub08;
/*
 * 날짜: 2023/06/22
 * 이름: 최동일
 * 내용: JAVA 추상클래스 실습하기
 */
/*
 * 추상클래스(Abstract Class)
 * -일반 클래스를 정의하기 위한 기본 틀을 제공하는 클래스
 * -추상클래스를 상속 받아 자식클래스에서 미완성 메서드(추상메서드)를 완성, 다형성 활용
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		
		//추상클래스 생성
		// Car car = new Car();처럼 추상클래스는 생성할 수 없다.
		
		//Sedan sonata= new Sedan("소나타","흰색",0,2000);
		//를해도 되지만 다형성을 위해서 car를 사용한다.
		Car sonata= new Sedan("소나타","흰색",0,2000); 
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo= new Truck("봉고", "남색", 0, 0);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
	}
}
