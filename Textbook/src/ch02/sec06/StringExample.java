package ch02.sec06;
/*
 * 날짜: 2023/6/14
 * 이름: 최동일
 * 내용: 교재 50p 예제
 */
public class StringExample {
	public static void main(String[] args) {
		String name= "홍길동";
		String job= "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str="나는 \"자바\"를 배웁니다.";//string문안에 ""을 넣고 싶으면 \"내용\" 역슬래시로 한다.
		System.out.println(str);
		
		str="번호\t이름\t직업\t나이";// \t는 탭만큼 띄워서 출력한다.
		System.out.println(str); 
	}
}
