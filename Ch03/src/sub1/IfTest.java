package sub1;
/*
 * 날짜: 2023.6.13
 * 이름: 최동일
 * 내용: Java의 조건문인 if문 실습하기
 */
public class IfTest {

	public static void main(String[] args) {
		
		//if
		int num1= 1;
		int num2= 2;
		
//		if(조건문) {
//			내용1
//		}
//		내용2
//		조건문의 내용이 참일경우 내용1이, 거짓일 경우 내용2가 된다.
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다.");
		}
		if(num1>1) {
			System.out.println("num1은 1보다 크다");
		}
		if(num1>0) {
			if(num2>1) {
				System.out.println("num1은 0보다 크고, num2는 1보다 크다.");
			}
		}
		if(num1>0&&num2>1) {
			System.out.println("num1은 0보다 크고, num2는 1보다 크다.");	
		}
		
		//if~else
//		if(조건1) {
//			내용1
//		}else {
//			내용2
//		}
//		
//		조건1이 참이면 내용1이, 조건1은 거짓이면 내용2가 출력된다.
		int var1=1, var2=2;
		if(var1>var2) {
			System.out.println("var1이 var2보다 크다.");
		}else {
			System.out.println("var2이 var1보다 크다.");
			
		}
		
		//if~else if~else
//		if(조건1) {
//			내용1
//		}else if(조건2){
//			내용2	
//		}else if(조건3){
//			내용3
//		}else {
//			내용4
//		}
//		조건 1이 참일 경우 내용1,
//		조건 1 거짓, 2참 -> 내용2
//		조건 1,2거짓 3참 -> 내용3
//		조건 1,2,3 거짓 -> 내용4
		int n1=1, n2=2, n3=3, n4=4;
		
		if(n1>n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n2>n3) {
			System.out.println("n2이 n3보다 크다.");
			
		}else if(n3>n4) {
			System.out.println("n3이 n4보다 크다.");
			
		}else {
			System.out.println("n4가 가장 크다.");

		}
		
		
	}
}
