package sub03;
/*
 * 날짜: 2023/06/20
 * 이름: 최동일
 * 내용: 클래스 변수, 클래스 메서드 실습하기
 */
/*
 * 클래스 변수, 클래스 메서드(정적변수, 정적 메서드)
 * -static을 선언한 변수, 메서드로 Method Area에 생성
 * -별도의 객체 생성new를 하지 않고 클래스 타입으로 참조
 * -객체(인스턴스)간의 공유 목적으로 클래스변수, 클래스메서드 사용
 * 
 * 
 * 싱글톤 객체(singleton)
 * -static을 활용한 싱글톤객체는 오직 하나의 인스턴스로 메모리싱에 존재
 * -싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 * 
 */


class Increment{
	private int num1;
	public static int num2;
	//정적변수가 될 때는 public을 사용한다.
	
	public Increment(){
		num1++;
		num2++;
		
		System.out.println("num1 =" +num1);
		System.out.println("num2 =" +num2);
	}
}
public class StaticTest {

	public static void main(String[] args) {
		
		
		//Increment 실습
		Increment inc1= new Increment();
		System.out.println("-------------------");
		
		Increment inc2= new Increment();
		System.out.println("-------------------");
		Increment inc3= new Increment();
		
		
		//sonata, avante같은애들을 인스턴스(참조변수)
		Car sonata = new Car("소나타","흰색",10);
		Car avante = new Car("아반떼","검은색",20);
		Car grande = new Car("그랜져","남색",30);
		
		sonata.show();
		avante.show();
		grande.show();
	
		//클래스 변수 참조
		//클래스 이름으로 참조하려면 static이 붙은 애들만 가능하다.
		//car.color이런 식으로 출력할 수 없다.
		
		System.out.println("전체 차량 수: "+ Car.count);
		
		//클래스 메서드 호출
		System.out.println("현재 차량 수: "+Car.getCount());
		
		
		
		//싱글톤 객체 실습
		//오직 하나의 인스턴스로 생성되는 객체를 싱글 톤이라고 한다.
		//Calc c1= new Calc(); c1을 객체로 만들려고 하는데 안만들어짐
		//하나의 instance를 참조.
		//static매서드는 static 변수에서만 참조 가능하다.
		//static매서드가 
		Calc c1= Calc.getInstance();
		Calc c2= Calc.getInstance();
		
		int result1= c1.plus(2,3);
		int result2= c2.minus(1, 2);
	
		System.out.println("result1 ="+result1);
		System.out.println("result2 ="+result2);
	}
}
