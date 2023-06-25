package sub08;

public abstract class Car {

	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name= name;
		this.color= color;
		this.speed= speed;
	}
	//메서드 선언 - 추상선언 -abstract를 붙이면됨
	//그리고 class에도 abstract를 붙여줘야함.
	//추상클래스는 최소 하나 이상의 추상 메서드를 구현하는 클래스
	
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	//의 두개의 메서드는 상속받는 자식 클래스에서 완성을 해야한다.
	
	public void show() {
		System.out.println("차량명 :"+this.name);
		System.out.println("차량색 :"+this.color);
		System.out.println("현재속도 :" +this.speed);
	}
}
