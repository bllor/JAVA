package test08;
/*
 * 날짜: 2023/07/21
 * 이름: 최동일
 * 내용: 자바 총정리 연습문제 8
 */

@FunctionalInterface
interface NumericLamda{
	boolean test(int n);
}
public class Test5 {

	public static void main(String[] args) {
		
		//x
		NumericLamda isEven = (n) -> n%2== 0;
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		if(!isEven.test(3)) {
			System.out.println("3은 짝수아님");
		}
		
		
		NumericLamda isNonNeg = (n) -> n>=0;
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
		if(!isNonNeg.test(-1)) {
			System.out.println("-1은 음수");
		}
		
	}
}
