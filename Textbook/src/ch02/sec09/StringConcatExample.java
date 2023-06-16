package ch02.sec09;
/*
 * 날짜: 2023/6/16
 * 이름: 최동일
 * 내용: 교재 P64 예제
 */
public class StringConcatExample {
	public static void main(String[] args) {
		//숫자연산
		int result0= 10+2+8;
		System.out.println("result0 : "+result0);
		//결합연산
//		String result1= 10+2+8; result는 int형이라 string으로 받을 수 없음.
//		System.out.println("result1 : "+result1);
		
//		+과정 중에 문자열이 있으면 문자열로 자동변환되어 결합연산을 수행한다.
		String result2= 10+2+"8";//10+2가 수행된 다음 문자열이 나와서 128이 된다.
		System.out.println("result2 : "+result2);
		String result3= 10+"2"+8;//10+문자열이라서 1028이 된다.
		System.out.println("result3 : "+result3);
		String result4= "10"+(2+8);//문자열이 맨 앞에 나왔지만 ()안이 먼저 연산되므로 1010이 된다.
		System.out.println("result4 : "+result4);
		
			}
}
