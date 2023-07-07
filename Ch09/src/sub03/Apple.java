package sub03;

import java.io.Serializable;

public class Apple implements Serializable 
{
//The serializable class Apple does not declare a static final serialVersionUID field of type long
//객체를 식별할 수 있는 번호를 추가해라는 뜻
//디폴트 시리얼 ~ 클릭하면됨.
	private static final long serialVersionUID = 1L;

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show(){
		System.out.println("원산지 : "+this.country);
		System.out.println("가격 : "+this.price);
	}
}
