package sub01;
/*
 * 날짜: 2023/06/27
 * 이름: 최동일
 * 내용: JAVA Object 클래스 실습하기
 */
/*
 * 자바의 모든 클래스는 암시적으로 object클래스에게 상속 받고 있다.
 * 
 * Object클래스
 * -자바의 최상위 클래스로 모든 클래스는 Object를 암시적으로 상속 받음
 * -주요 기능은 개체 비교를 위한 equals, 객체 정보 조회를 위한 ToString()제공
 */
public class ObjectTest {
	
	public static void main(String[] args) {
	
		
//		Apple a1 = new Apple("한국",1000);
//		Apple a2 = new Apple("일본",500);
		
		
		Object a1 = new Apple("한국",1000);
		Object a2 = new Apple("일본",500);
		
		
		
		//애플로 선언했지만 다형성을 위해서 object를 사용함
		//object로 객체를 만들어도 똑같이 사용됨.	
		
		System.out.println(a1);
		System.out.println(a2);
		a1.toString();//직접호출하는 방법/ 직접호출해도 같음
		a2.toString();
		
		
		
		//객체 비교
		if(a1 == a2) {//변수의 값을 비교 -> 객체의 주소를 비교한다고 봐도됨.
			System.out.println("a1,a2의 주소가 같다");
		}else {
			System.out.println("a1,a2의 주소가 다르다.");
		}
		
		if(a1.equals(a2)) {// a1,a2가 가리키는 객체 주소가 같니?
						  //equal매서드는 apple에 정의하지 않았지만  object에 있음
						  //주소비교가 아니라 a1,a2가 가리키는 객체를 비교.
			
			System.out.println("a1,a2의 객체가 같다");
		}else {
			System.out.println("a1,a2의 객체가 다르다.");
		}
		
		
		
		
	}
	

}
