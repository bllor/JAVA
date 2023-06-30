package test04;
/*
 * 날짜: 2023/06/30
 * 이름: 최동일
 * 내용: 자바 API클래스 연습문제
 */
//x

class Apple{
	
	private String country;
	private int price;
	public Apple(String country, int price) {
		
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지  :"+country);
		System.out.println("가격 :"+price);
	}
	
	
}

class Banana{
	
	private String country;
	private int price;
	public Banana(String country, int price) {
		
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지  :"+country);
		System.out.println("가격 :"+price);
	}
	
	
}

class Grape extends Object{
	
	private String country;
	private int price;
	public Grape(String country, int price) {
		
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지  :"+country);
		System.out.println("가격 :"+price);
	}
	
	
}
public class Test06 {

	public static void main(String[] args) {
	
		
		Test06 test = new Test06();
		Apple apple = new Apple("한국",3000);
		Banana banana = new Banana("필리핀",2000);
		Grape grape = new Grape("미국",3000);
		
		test.showinfo(apple);
		test.showinfo(banana);
		test.showinfo(grape);
			
	}

	private void showinfo(Object fruit) {
		
		if(fruit instanceof Apple) {
			//타입검사를 하는 연산키워드 instanceof
			//fruit가 apple이라면
			Apple apple = (Apple) fruit;//다운캐스팅해야함
			//상위 클래스인 fruit를 하위클래스인Apple과 같게 만드려면
			//다운캐스팅을 해주어야 한다.
			
			apple.show();
		}
		
		if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			banana.show();
		}
		if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			grape.show();
		}
	}
}
















































