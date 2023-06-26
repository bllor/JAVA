package ch11.sec02.exam01;
/*
 * 날짜: 2023/06/26
 * 이름: 최동일
 * 내용: 466p예제
 */
public class ExceptionHandlingExample1 {

	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수 :"+ result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);//null이 있어서 마지막 코드가 출력이 안된채 마무리 된다.
		System.out.println("[프로그램 종료]");
	}
}
