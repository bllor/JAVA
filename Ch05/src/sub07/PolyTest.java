package sub07;

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
		a1.hunt();//얘는 에러가 발생함.
				  //a1.move는 animal의 move를 호출하는 것임 a1이 animal로 선언되어서 실제적인 인스턴스는 animal
				  //하지만 상속이 되어서 tiger의 move가 animal의 move를 오버라이드해서 tiger의 move가 출력이 됨.
				  //이럴경우 animal에 hunt 메서드를 정의하여 호출될 수 있게 만들어야 한다.
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
