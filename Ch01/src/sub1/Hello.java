package sub1;

/*
 * 날짜: 2023.6.12
 * 이름: 최동일
 * 내용: Ch01.Java 개발환경 구축
 */
public class Hello {
	//프로그램 진입점
	
	public static void main(String[] args) {
		//main하고 ctrl+space 누르면 단축키 나옴
		//기본출력
		System.out.println("Hello World~");
		System.out.println("Hello Java");
		
		//한줄출력 print을 하게 된다면 출력문들이 한 줄로 나온다.
		System.out.print("Hello");
		System.out.print("Korea~");
		
		//개행처리 개행:줄바꿈
		System.out.print("\n");//\n이 개행처리를 뜻한다.
		System.out.print("Hello Busan~");
		System.out.print("Hello Busan~"+"\n");//이렇게 해도 처리가 된다.
		System.out.print("Hello Busan~");
		}
}
