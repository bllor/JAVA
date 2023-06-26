package ch11.sec02.exam02;
/*
 * 날짜: 2023/06/26
 * 이름: 최동일
 * 내용: 468p예제
 */
public class ExceptionHandlingExample {

	
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.string가 존재합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.string2가 존재합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
