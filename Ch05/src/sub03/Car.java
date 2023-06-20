package sub03;

public class Car {
//	필드는 heap에 저장됨
	private String name;
	private String color;
	private int speed;

//	클래스 변수= 정적변수 는 method area에 저장이 된다.
	public static int count;
	
	public Car(String name, String color, int speed) {
		this.name= name;
		this.color= color;
		this.speed= speed;
		count++;//car라는 객체가 생성이 될 때 count가 1씩 증가가 됨.
		
	}
	
//	정적메서드
//클래스 변수를 다루므로 이 메서드도 클래스 메서드로 다루어야 한다.
	public static int getCount() {
		return count;
	}
	
	public void speedUp(int speed) {
		this.speed +=speed;
	}
	public void speedDown(int speed) {
		this.speed-=speed;
	}
	public void show() {
		System.out.println("차랑명: "+this.name);
		System.out.println("차량색: "+this.color);
		System.out.println("현재속도: "+this.speed);
	}
	
	
	
}
