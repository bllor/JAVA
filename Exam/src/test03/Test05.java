package test03;
/*
 * 날짜: 2023/06/23
 * 이름: 최동일
 * 내용: 싱글톤 객체 연습문제
 */
//리뷰듣고 오답하기
class Vehicle{
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public void info() {
		System.out.println("=====================");
		System.out.println("차량명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("----------------------");
	}
	
}

class CarFactory{
	
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}// new연산 하지 못하게 막아놓음
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		//return 타입이 나와야 하는데 객체도 리턴 타입으로 될 수 있음.
		return new Vehicle(name, price);			  		
//		Vehicle v = new Vehicle(name, price)
//				return v;
//		v 는 vehicle타입
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
//		CarFactory.getInstance();<- 클래스의 메서드 호출 방법?
		
		Vehicle avante= factory.createCar("아반떼", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
