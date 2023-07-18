package confirm.ch03;
/*
 * 날짜: 2023/07/18
 * 이름: 최동일
 * 내용: ch03 연산자 test
 */
public class Test3 {

	public static void main(String[] args) {
		
		int pencils = 534;
		int students = 60;
		
		int pencilsperStudent = pencils/students;
		System.out.println(pencilsperStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		
	}
}
