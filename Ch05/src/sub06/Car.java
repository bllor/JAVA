package sub06;

public class Car {
	protected String name;
	protected String color;
	protected int speed;
	
	//초기화를 위한 생성자
	public Car(String name, String color, int speed) {
		this.name= name;
		this.color= color;
		this.speed= speed;
	}
	
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	
	public void speedDown(int speed) {
		this.speed-=speed;
		
	}
	
	public void show() {
		System.out.println("차량명 :"+this.name);
		System.out.println("차량색 :"+this.color);
		System.out.println("현재속도 :" +this.speed);
	}
}
