package sub09;

public class Sedan implements Car{
	
	//인터페이스를 사용하려면 implements를 사용해야함

	
	private String name;
	private String color;
	private int speed;
	
	
	
	public Sedan(String name, String color, int speed) {
	
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public void speedUp(int speed) {
		
		this.speed+=speed;
	}

	@Override
	public void speedDown(int speed) {
		
		this.speed-=speed;
	}

	@Override
	public void show() {
		
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
	}

}
