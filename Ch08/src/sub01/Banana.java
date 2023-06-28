package sub01;

public class Banana {

	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country= country;
		this.price = price;
	}
	
	@Override
	public String toString() {	//toString은 Object에서 정의되고 있으며, 해당 클래스의 정보를 출력할 때 사용하는 메서드
		
		String result = "원산지 : "+country+"\n가격 : "+price;
		return result;
		
	}
}
