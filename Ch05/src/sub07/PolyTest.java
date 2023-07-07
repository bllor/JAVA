package sub07;
/*
 * 날짜: 2023/06/22
 * 이름: 최동일
 * 내용: JAVA다형성 실습하기
 */
/*
 * 다형성(Polymorphism)
 * -상속관계에서 부모클래스의 기능이 자식클래스에서 닿양한 기능으로 변하는 특성
 * -객체의 타입선언으 ㄹ부모클래스 타입으로 선언
 * -다형성을 활용해서 프로그래밍의 중복을 줄이고 유연성을 높임
 */
public class PolyTest {

	public static void main(String[] args) {
		
		
		//다형성을 적용한 객체 생성(업캐스팅)
		Animal a1 = new Tiger(); //tiger라는 객체를 animal로 바꿈 -> 업케스팅
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		//코드의 통일성이 보임
		
		/*
		Tiger tiger= new Tiger();
		Eagle eagle= new Eagle();
		Shark shark= new Shark();
		보다 통일성이 보인다.
		*/
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		//같은 move이지만 method가 다르게 호출이 된다.
		
		
		//다운캐스팅
		Tiger tiger = (Tiger) a1; //animal의 참조변수 a1을 tiger로 변환하는 것을 다운캐스팅이라고 한다.
								  //a1앞에 ()를 해서 변환할 클래스를 넣어줘야함.
		Eagle eagle=  (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		//객체 타입 비교연산
		
		if(a2 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
			
		}else if(a2 instanceof Eagle) {
			System.out.println("a1은 Eagle입니다.");
		}else {
			System.out.println("a1은 Shark입니다.");
		}
		
		//다형성을 활용한 객체배열
		//{}은 같은 타입을 데이터를 묶어놓음.
		//숫자면 숫자, 문자열이면 문자열 객체도 같은 타입이므로 묶을 수 있다.
		//{tiger,eagle,shark}를 묶으려고 한다면
		
		Animal	arr1[]= {tiger,eagle,shark};
		arr1[0].move();
		arr1[1].move();
		arr1[2].move();
	}
}
