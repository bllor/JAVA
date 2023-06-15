package sub2;
/*
 *  날짜:2023/6/15
 *  이름:최동일
 *  내용:Java 매서드 실습하기
 *  
 *  클래스라는 구조체 안에 매서드가 들어간다.
 */

public class MethodTest {
	int num=1;//전역변수 모든 곳에서 사용할 수 있음
			  //클래스에서 사용하는 것 멤버변수
			  //전역변수: 
	//main method - 프로그램 진입점
	public static void main(String[] args) {
		//메서드 호출
		int y1= f(1);
	
		int y2=f(2);
		
		System.out.println("y1 = "+y1);
		/*
		 * 1.public static void main(String[] args) 부터 시작
		 * 2.int y1= f(1); 로 이동 ->f(1)이 작동
		 * 3.public static int f(int x)에서 int 1이 됨.
		 * 4.int y=2*1+3=5; ->return y=5; y는 5가 됨.
		 * 5.int y1= f(1)=5 ->  y1=5가 저장이 된다.
		 */
		
		//메서드로 진입하려면 디버깅창에서 f5를 누르면 된다. 진입하게 되면 f6으로 진행하여야 함.
		
//		매서드 지역변수와 스택
		int t1= sum(1,10);//변수 값이 있어야 출력이 가능하다.
		System.out.println(t1);
		int t2=sum(1,100);
		System.out.println(t2);
		
	}
	
	//메서드 정의
	public static int f(int x) {//원래는 static이 빠지지만 main이 static 함수이므로 맞춰주기 위해서 static을 붙여
		
		int y=2*x+3;
		
		return y;//void는 return을 쓸 수 없다.
	}
	
	
	//메서드 정의
	public static int sum(int start, int end){//void는 리턴값을 모를 때 사용
		//지역변수: 메서드가 종료되면 스텍에서 해제됨
		//메개변수도 지역변수
		//스택에서 메서드의 과정이 끝난 뒤return값을 받아서 나감.
		
		int total = 0;
		for(int k=start;k<=end;k++) {
			total+=k;
		}
			
		return total;//void를 하면 오류가 나는데 void와 return을 일치시켜주어야 한다.
	}
	
}


/*
 * stack은 데이터가 쌓여 있는 것. 데이터를 입력할 대는 push, 출력할 대는 pop
 */

