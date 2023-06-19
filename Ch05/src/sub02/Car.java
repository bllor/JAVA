package sub02;

public class Car {
	private String name;
	private String color;
	private int speed;
	//private를 하게 되면 외부 클래스에서 접근할 수 없게 만든다.
	//클래스의 객체를 캡슐화하여야 한다.
	
	
	//생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	//메서드 이름인데도 불구하고 대문자로 시작함.
	//클래스 이름과 동일한 메서드이다
	//매서드는 외부에서 활용해야 하므로 private를 하지 않는다.
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color= color;
		this.speed = speed;
	}
	
	
	public void speedUp(int speed){
		this.speed+=speed;
	}
	
	public void speedDown(int speed){
		this.speed-=speed;
	}
	
	public void show(){
		System.out.println("차량명: "+this.name);
		System.out.println("차량색: "+this.color);
		System.out.println("현재속도: "+this.speed);
	}
	
	//getter, setter정의
	//옵션이므로 필요에 따라 정의한다.
	//외부에서 private를 참조하기 위해서 메서드를 사용함
	//setter를 이용해서 private의 값을 바꾸고
	//getter를 이용해서 private가 되어있는 값을 가지고 온다.
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
	
}

	
	
	