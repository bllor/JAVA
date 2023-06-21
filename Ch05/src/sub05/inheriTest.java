package sub05;

/*
 * 날짜: 2023/06/21
 * 이름: 최동일
 * 내용: JAVA 클래스 상속 실습하기
 */
/*
 * 클래스의 기능을 상속을 통해서 다른 클래스에서 사용할 수 있게 만든다.
 * 상속을 받으면 자식 클래스에 의무가 생기는데, 부모님의 속성을 초기화 해주어야 한다.
 * 부모의 속성을 초기화한 뒤, 부모의 생성자로 넘겨준다(super()를 사용하여 넘겨준다.)
 */
/*
 * 상속(Inheritance)
 * -부모 클래스의 속성과 기능을 그대로 자식 클래스에게 확장시키는 프로그래밍 문법
 * -공통적인 로직 내용을 부모클래스에 두고 자식클래스에서 상속받아 일관된 프로그래밍 수행
 * -부모클래스의 속성 접근권한을 protected로 변경하고 자식클래스에서는 부모 속성 초기화
 */
class Parent{
	private int num1;
	private int num2;
	
	
	public Parent(int num1, int num2) {
		this.num1= num1;
		this.num2= num2;
	}
	
	
	public int	 plus() {
		return num1+num2;
	}
	
}

class Child extends Parent{
	
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2);//부모생성자를 호출하는 것.
		this.num3=num3;
		this.num4=num4;
		
	}
	
	public int minus(){	
		return num3-num4;
	}
	
}

public class inheriTest {
	
	public static void main(String[] args) {
		
		//상속객체 생성
		Child c1= new Child(1,2,3,4);//child와 parent가 단일객체처럼 heap에 생성된다.
		int rs1= c1.plus();//부모 메서드를 물려받아서 자식에서 사용할 수 있다.
		int rs2= c1.minus();
		System.out.println("rs1 ="+rs1);
		System.out.println("rs2 ="+rs2);
		
	

	
	//Car 상속객체 생성
	Sedan sonata = new Sedan("소나타","흰색",0,2000);
	sonata.speedTurbo(20);
	sonata.show();
	
	
	
	Truck bongo = new Truck("봉고","남색",0,0);
	bongo.load(100);
	bongo.speedup(50);
	bongo.show();
	
	
	
	//Account 상속 객체 생성
	StockAccount kb = new StockAccount("KB증권", "101-123-456", "홍길동", 10000, "삼성전자", 10, 60000);
	kb.deposit(1000000);
	kb.buy(5,50000);
	kb.sell(5,62000);
	kb.show();
	
	}
}
