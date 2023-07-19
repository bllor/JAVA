package confirm.ch06;
/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 6장 확인문제
 */
class Printer1{
	int number;
	boolean a;
	double s;
	String m;
	
	public static int Println(int number) {
		System.out.println(number);
		return number;
	}
	public static  boolean Println(boolean a) {
		System.out.println(a);
		return a;
	}
	public  static double Println(double s) {
		System.out.println(s);
		return s;
	}
	public static  String Println(String m) {
		System.out.println(m);
		return m;
	}
}
public class Test17 {

	public static void main(String[] args) {
		Printer1.Println(10);
		Printer1.Println(true);
		Printer1.Println(5.7);
		Printer1.Println("홍길동");
	}
}
