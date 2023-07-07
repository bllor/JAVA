package sub01;

/*
 * 날짜 : 2023/07/04
 * 이름 : 최동일
 * 내용 : 함수형 프로그래밍 실습하기
 */
/*
 * 함수형 프로그래밍
 * -프로그래밍 단위를 함수 단위로 실행하는 프로그래밍 패러다임
 * -함수형 프로그래밍의 함수는 람다식으로 표현
 * 
 */
interface A{
	
	public void method();
		
	
}


class B implements A{
	public void method() {
		System.out.println("method 실행");
	};
}

public class FuntionalTest {

	public static void main(String[] args) {
	
		
		//객체지향방식 <- 가장 보편적인 방식
		A a1 = new B();//업캐스팅
		a1.method();
		
		//익명 클래스 인터페이스를 바로 객체로 생성하는 것
		//클래스 정의를 하지 않아도 되어서 객체지향방식보다 세련된 방식
		//swing에서 이벤트 처리를 할 때 많이 사용됨 버튼을 처리할 때 사용하는 기능
		A a2 =new A() {
			
			@Override
			public void method() {
				System.out.println("method 실행");
			}
			
		};//A는 인터페이스이기 때문에 }뒤에 ;가 있어야 함.
		a2.method();
		
		
		
		
		//함수형 프로그래밍 방식(람다식) ->가 람다 기호 ()매개변수자리 {}함수의 본문
		A a3 = () -> {System.out.println("method 실행");};
		a3.method();
		
		
		
	}
}
