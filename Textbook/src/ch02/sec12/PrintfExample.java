package ch02.sec12;
/*
 * 날짜: 2023/6/16
 * 이름: 최동일
 * 내용: printf사용방법
 */
public class PrintfExample {
	public static void main(String[] args) {
/*
 * 1.정수
정수를 받고 싶을 때는 %d를 사용한다.
%6d :6자리 정수, 왼쪽 빈자리 공백
%-6d:오른쪽 빈자리 공백
%06d:왼쪽 빈자리 0으로 채움
오른쪽 빈자리 0으로 채움은 없음, 생각해보면 오른쪽 빈자리를 0으로 채우는 것은 값을 입력하기 때문인듯
 	
 */
		int value = 123;
		System.out.printf("상품가격%d원\n",value);
		System.out.printf("상품가격%6d원\n",value);
		System.out.printf("상품가격%-6d원\n",value);
		System.out.printf("상품가격%06d원\n",value);
		
/*2. 실수
 * %f로 나타냄
 *	실수는 정수7자리+소수점+소수2자리까지 나타냄 
 *
 */
		
		double pi =3.1415;
		double pi2 =123453.112321415;
		
		System.out.printf("파이는 %f\n",pi);
		System.out.printf("파이2는 %f\n",pi2);
	
/*
 * 3.문자열
 * %s로 나타냄	
 */
		String s1= "홍길동";
		String s2= "도적";
		System.out.printf("%s는%s이다.",s1,s2);

/*
 * 4. 특수문자
 * \t: 탭만큼 띄워쓰기
 * \n: enter키와 같음
 * %%: %를 나타냄
 */
	}
	
	
}
