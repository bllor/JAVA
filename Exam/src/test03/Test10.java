package test03;
/*
 * 날짜: 2023/06/23
 * 이름: 최동일
 * 내용: 인터페이스 연습문제
 */

interface Buyer{
	public void Buy();
}

interface Seller{
	public void sell();
}

class Customers implements Buyer, Seller{
	@Override
	public void sell() {
		System.out.println("판매하기");
	};
	
	
	@Override
	public void Buy() {
		System.out.println("구매하기");
	};
}

public class Test10 {

	public static void main(String[] args) {
//		Buyer buyer = new Customers();
//		Seller seller = new Customers();
		
		Customers buyer = new Customers();
		Customers seller = new Customers();
		//이렇게 사용할 수도 있음
		buyer.Buy();
		seller.sell();
	}
}
