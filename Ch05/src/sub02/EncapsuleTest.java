package sub02;
/*
 * 날짜: 2023/06/19
 * 이름: 최동일
 * 내용: JAVA 캡슐화 실습하기
 */
/*
 * 여기서 car나 account는 외부 클래스이므로 외부가 된다.
 * EncapsuleTest는 car의 외부클래스이다.
 * 
 * 캡슐화(정보은닉, Encapsulation)
 * - 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보를 은닉하는 특성
 * - 클래스의 속성은 반드시 private선언을 통해 캡슐화
 * - private 속성의 초기화를 위해 생성자(Constructor)정의
 * - 은닉된 정보의 안전한 사용을 위해서 Getter, Setter를 사용
 */
public class EncapsuleTest {

	public static void main(String[] args) {
//		Car sonata = new Car();
//		sonata.name="소나타";
//		sonata.color= "흰색";
//		sonata.speed= 10;
//		private를 하게 되면 위와 같이 초기화 하지 못한다.
		
		Car sonata= new Car("소나타","흰색",10);
		//Car클래스의 생성자를 사용해서 초기화가 된다.
		//sonata의 필드는 보이지 않는다.
		//sonata.setName("그랜져"); private가 되어있는 name의 값을 변경할 때 setName을 사용한다.
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반떼","검은색",20);
		avante.setColor("무지개색");
		avante.speedUp(100);
		avante.speedDown(20);
		avante.show();
		//System.out.println(avante.getColor()); 아반떼의 컬러 값을 가져옴
		
		System.out.println("--------------------------");
		Account kb= new Account("국민은행", "123214412", "김유신", 10000);
		Account wr= new Account("국민은행", "2121421423", "김춘추", 50000);
		
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.show();
		
		wr.deposit(500000);
		wr.withdraw(100000);
		wr.show();
	}
}
