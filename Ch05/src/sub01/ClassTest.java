package sub01;
/*
 * 날짜: 2023/06/19
 * 이름: 최동일
 * 내용: JAVA 클래스 실습하기
 */
/*.java로 되어있는 파일을 자바 파일 또는 클래스라고 한다.
 * 
 * 클래스와 객체
 * - 클래스는 객체를 생성하는 구조체이고 속성(필트, 멤버변수)과 기능(멤버, 메서드)으로 설계
 * - 객체(Object)는 클레스의 실제 인스턴스, new 연산으로 생성
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		//객체(Object=Instance)생성
		Car sonata = new Car();//같은 패키지에 있는  Car를 가져옴
		//변수 앞에는 자료형 타입이 나와야함 -> sonata의 클래스가 car이기 때문에 Car라는 자료형이 나와야함.
		//여기서 sonata는 객체 & 참조변수라고 한다.
		//참조변수가 생성되고 클래가 지정된다.
		
		//객체 초기화
		//객체가 가지고 있는 필드의 값을 초기화 하는 것.
		//소나타의 필드는 3개
		
		sonata.name="소나타";
		sonata.color="흰색";
		sonata.speed=0;
		
		//객체활용 - 객체를 활용한 프로그램이 객체지향 프로그래밍
		//매서드를 호출
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
//		System.out.println(sonata); <- 주소값이 출력됨.
		//객체 생성과 초기화 동시에 
		Car Avante = new Car();
		Avante.name="아반떼";
		Avante.color="검은색";
		Avante.speed=0;
//		Car Avante; 선언
//		Avante= new Car(); 생성
//		초기화
//		Avante.name="아반떼";
//		Avante.color="검은색";
//		Avante.speed=0;
		
		Avante.speedUp(80);
		Avante.speedDown(40);
		Avante.show();
//		car를 가지고 sonata를 만들고 avante를 만드는 것이 객체 재활용	
		
		//Account객체 생성
		Account kb= new Account();
		kb.bank="국민은행";
		kb.id="2121421421";
		kb.name="최동일";
		kb.balance=10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		Account uri = new Account();
		uri.bank="우리은행";
		uri.id="1234121";
		uri.name="우리";
		uri.balance=100000;
		
	

	/*
	 * 변수가 스택에 쌓임
	 * 소나타 먼저 쌓이고, 아반떼가 쌓임
	 * 얘네가 쌓일 때 값은 어떤 것일까?
	 * 참조값으로 저장이 됨.
	 * 객체에서는 메모리구조 hexp자료구조가 나옴.
	 * new를 하는 순간 hexp에 객체가 생성이 됨.(주소값을 가지고 생김)
	 * hexp에 생긴 주소값이 sonata에 저장이됨.
	 * sonata.color일 때 sonata안에 있는 color를 가르킨다는 뜻
	 */
	}

}
