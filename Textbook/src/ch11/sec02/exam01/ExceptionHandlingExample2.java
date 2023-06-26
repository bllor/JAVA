package ch11.sec02.exam01;
/*
 * 날짜: 2023/06/26
 * 이름: 최동일
 * 내용: 467p예제
 */
public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		
		try{int result = data.length();
		System.out.println("문자 수 :"+ result);}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("-----------");
			System.out.println(e.toString()); 
			System.out.println("-----------");
			e.printStackTrace();
			}
		finally {
			System.out.println("마무리 실행");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
