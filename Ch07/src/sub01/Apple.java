package sub01;

public class Apple {

	private String country;
	private int price;
	
	
	public Apple(String country, int price){
		this.country= country;
		this.price= price;
	}
	
	
	@Override//object 클래스를 상속 받고 있으므로 override가됨.
	public String toString() {

		System.out.println("객체 해시값 : "+hashCode());//객체의 유일한 식별번호
		System.out.println("country :"+this.country);
		System.out.println("price : "+this.price);
		return super.toString();//부모의 toString리턴//주소값이 출력
		
	}
	
}
