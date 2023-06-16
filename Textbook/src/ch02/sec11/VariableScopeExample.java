package ch02.sec11;
/*
 * 날짜: 2023/6/16
 * 이름: 최동일
 * 내용: 변수사용범위
 */
public class VariableScopeExample {
	public static void main(String[] args) {
		int v1= 15;
		if(v1>10) {
			int v2= v1-10;
		}
//		int v3= v2-5; v2는 if{}안에 정의되어서 {}밖에서는 사용할 수 없다.
//		그래서 위와 같은 형식으로 쓸 수 없다.
	}
}
