package sub01;
/*
 * 날짜: 2023/06/26
 * 이름: 최동일
 * 내용: Java 예외처리 실습하기
 */
/*
 * 예외처리(Exception)
 * -예외는 프로그램 실행 중에 발생하는 모든 에러(Error)
 * -실행중(Runtime)에 발생하는 예외와 컴파일(compileTime)에 발생하는 예외처리.
 * -메서드 내부에 발생하는 예외를 호출하는 쪽으로 throws.
 * -사용자가 생성한 예외를 throw
 * 
 */
public class ExceptionTest {

	public static void main(String[] args) {
		
		
		//실행예외 - 프로그램이 실행되면서 발생하는 예외
		
		//예외상황1: 어떤 수를 0으로 나눌 때 
		int num1 =1;
		int num2 =0;
		//1나누기0이되면 에러가 뜬다.
		
		int rs1= num1+num2;
		int rs2= num1-num2;
		int rs3= num1*num2;
		int rs4= 0;
		
		try {
			//예외가 발생할 가능성이 있는 코드 작성
			 rs4 = num1/num2;
			//int rs4 = num1/num 2;-<는 try안에서만 사용가능  지역변수 이므로
			
		}catch(ArithmeticException e) {
			//예외가 발생했을 때 처리할 코드를 작성
			//Exception예외는 상속관계가 있음
			//Exception을 사용하게 되면 하위 예외들을 다 처리할 수 있다.
			e.printStackTrace();//예외내용 출력
		}
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		//지금은 에러가 뜨면서 처리가 안되는데
		//에러가 뜨더라도 계속 진행될 수 있게 만들어야한다.
		//이럴 때 try~catch를 사용한다.
		//try catch를 하게 되면 코드가 지져분해진다.
		//문제가 생기는 부분을 찝을 수 없다면 모두다 넣어도 된다.
		
//		int num1 =1;
//		int num2 =0;
//		
//		int rs1= 0;
//		int rs2= 0;
//		int rs3= 0;
//		int rs4= 0;
//		try {
//			 rs1= num1+num2;
//			 rs2= num1-num2;
//			 rs3= num1*num2;
//			rs4 = num1/num2;
//		}catch(ArithmeticException e) {
//			
//			e.printStackTrace();
//		} 이런식으로 모든 부분을 try catch를 사용해도 된다.
		
		
		//예외상황2 배열의 인덱스 범위를 벗어났을 때의 내용을 출력
		
		
		int[] arr = {1,2,3,4,5};
		
		
		try {
			for(int i = 0; i<6; i++) {
				System.out.println("arr["+i+"] :" +arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//배열의 인덱스 범위를 벗어났을 때의 내용을 출력
			e.printStackTrace();
			
		}
//		
//		for(int i = 0; i<6; i++) {
//			System.out.println("arr["+i+"] :" +arr[i]);
//		}
//		자바는 메인 끝에서 종료가 되어야 하지만 배열이 5가 되는 순간 에러가 발생한다.
		
	
		
		//예외상황3 - null point에러
		
		Animal ani = null; //  객체를 생성하지 않고 참조변수만 생성한 것.
		
		try {
		ani.move(); 
		ani.hunt();
		}catch(NullPointerException e) {
//			객체 생성 없이 참조(null 포인터 에러)
			e.printStackTrace();
		}
//		Animal의 메서드가 사용이 안됨.
//		참조변수는 참조값(메모리 주소)을 가지고 있어야 하는데
//		ani의 값이 null이므로 주소가 없어서 에러가 난다.
		
		
		//예외상황4 
		
		Animal a1 = new Tiger(); //업케스팅
		Animal a2 = new Eagle(); //업케스팅
		Animal a3 = new Shark(); //업케스팅
		
		//다운캐스팅 진행
//		Eagle eagle = (Eagle) a1; //a1은 타이거로 선언되었기 때문에 eagle로 다운 캐스팅 할 수 없다.
//								 //타이거로는 가능
//		Shark shark = (Shark) a2;
//		Tiger tiger = (Tiger) a3;
//		시행하게 되면  java.lang.ClassCastException: 이런에러가 나옴
		try {
			Eagle eagle = (Eagle) a1;
			Shark shark = (Shark) a2;
			Tiger tiger = (Tiger) a3;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
		
		
		//일반예외 - 프로그램이 실행되지 않아도 발생하는 에러
		//코드에 빨간 줄이 뜨는 예외가 일반에러.
		
		
		//Class animal = Class.forName("sub1.Animal");//클래스라고 하는 클래스 타입/static 메서드
		//위와 같이 입력하면 빨간줄이 나와서 진행이 되지 않음
	
		try {
			Class animal = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			//찾을 수 없는 클래스 선언
			e.printStackTrace();
		} finally {
			//예외처리 발생유무에 상관없이 마지막에 항상 실행되는 코드
			//파일 읽기 쓰기, 데이터 베이스 사용 등을 하게 되면 항상 파일을 닫아주어야 하는데 
			//파일 닫아주는 코드가 여기에 들어옴.
			System.gc();//사용하지 않는 메모리 정리(heap에 instance를 정리)
			System.out.println("finally 실행");
			
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
}
