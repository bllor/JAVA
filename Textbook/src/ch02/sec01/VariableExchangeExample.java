package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x=3;
		int y=5;
		
		System.out.println("x: "+x+" , y: "+y);
		int temp= x;
		x=y; //x에 5를 대입
		y=temp;//y에 3을 대입
		System.out.println("x: "+x+" , y: "+y);
	}

}
