package confirm.ch06;
/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 6장 확인문제
 */


class Printer{
	int number;
	boolean a;
	double s;
	String m;
	
	public int Println(int number) {
		System.out.println(number);
		return number;
	}
	public boolean Println(boolean a) {
		System.out.println(a);
		return a;
	}
	public double Println(double s) {
		System.out.println(s);
		return s;
	}
	public String Println(String m) {
		System.out.println(m);
		return m;
	}
}

public class Test16 {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		p.Println(10);
		p.Println(true );
		p.Println(5.7);
		p.Println("홍길동");
	}
}
