package test08;
/*
 * 날짜: 2023/07/21
 * 이름: 최동일
 * 내용: 자바 총정리 연습문제 8
 */
public class Test2 {

	public static void main(String[] args) {
		
		
		String str1 ="Hello";
		String str2 ="World";
		
		System.out.println("str1 역순 : "+resverseStr(str1));
		System.out.println("str2 역순 : "+resverseStr(str2));
	}
	
	public static String resverseStr(String str) {
		
	StringBuilder sb = new StringBuilder();
	for(int i =str.length()-1;i>=0;i--) {
		sb.append(str.charAt(i));
	}
	
	return sb.toString() ;
	}
	
}
