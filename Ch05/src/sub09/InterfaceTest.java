package sub09;
/*
 * 날짜: 2023/06/22
 * 이름: 최동일
 * 내용: JAVA 인터페이스 실습하기
 */
/*
 * 인터페이스는 두 개의 오브젝트를 연결해주는 역할
 * 인터페이스가 없다면 두 개의 오브젝트를 연결해주어야 하는데
 * 나중에 결합을 해제하기도 어려우므로 오브젝트로 연결하는 것이 좋다.
 */
/*
 * 인터페이스(Interface)
 * -클래스간의 공통의 표준 규격을 위한 설계 문법
 * -a,b,c이 연관이 되어있는데 각각 다른 사람이 만듬
 * -a,b,c가 통일화된 규격을 갖추기 위해서 interface를 통해서 가이드라인을 제시
 * -인터페이스를 활용하여 객체간 결합도를 완화하는 효과(다형성)
 * -부수적으로 다중상속 효과
 */
class TV extends Computer implements Internet{
//TV에 computer와 Internet을 연결하여 스마트 TV로 만들기	
	@Override
	public void accesss() {
		surf();
	}

	public void powerOn() {
		booting();
	}
}

class Computer{
	
	public void booting() {
		System.out.println("시스템 부팅...");
	}
	
	public void surf() {
		System.out.println("인터넷 서핑");
	}
	
}

interface Internet{
	public void accesss();
}


public class InterfaceTest {

	public static void main(String[] args) {
		
		//인터페이스 활용1- 표준화된 클래스 설계와 다형성 활용
		//Sedan sonata = new Sedan("소나타", "흰색", 0); 이렇게 사용해도 되지만
		//Car sonata = new Sedan("소나타", "흰색", 0);처럼 더 알아보기 쉽게 할 수 있다.
		
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo = new Truck("봉고", "남색", 0);
		bongo.speedUp(60);
		bongo.speedDown(20);
		bongo.show();
		
		
		
		//인터페이스의 활용2 - 유연성(결합도 완화)
		
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
		//인터페이스의 활용3- 다중 상속 효과
		
		TV smarttv = new TV();
		//여기서 다형성은 사용안됨. tv가 computer와 internet의 상속을 둘다 받고 있으므로 한 쪽으로만 묶을 수 없다.
		smarttv.accesss();
		smarttv.booting();
		
		
	}
}
















































