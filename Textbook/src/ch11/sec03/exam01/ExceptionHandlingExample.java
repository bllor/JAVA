package ch11.sec03.exam01;
/*
 * 날짜: 2023/06/26
 * 이름: 최동일
 * 내용: 470p예제
 */
public class ExceptionHandlingExample {

	
	public static void main(String[] args) {
		String[] array = {"100","1oo"};
		
		for(int i = 0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("배열인덱스가 초과됨"+a.getMessage());
			}catch(NumberFormatException n) {
				System.out.println("숫자로 변환할 수 없음"+n.getMessage());
			}
		}
	}
}
