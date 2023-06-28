package sub05;

public class Apple {

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country= country;
		this.price = price;
	}
	
	
	public void show() {
		System.out.println("------------------");
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
		System.out.println("------------------");
	}
	
	@Override
	public String toString() {	//toString은 Object에서 정의되고 있으며, 해당 클래스의 정보를 출력할 때 사용하는 메서드
		
		String result = "원산지 : "+country+"\n가격 : "+price;
		return result;
		
	}
}
