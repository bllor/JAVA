package sub01;


//car클래스 정의
public class Car {
//car를 추상화하려면 속성과 기능으로 한다.	
//필드와 메서드는 내가 정의할 수 있다.
//추상화:	
	
	//필드(속성)-클래스의 속성, 특징
		String name;
		String color;
		int speed;
		
		
	//메서드(기능)-필드와 연관된 기능을 정의한다.
	
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
}
//이것을 가지고 객체 오브젝트를 만들어야한다.
//instance를 만들어야함.
//new 연산자를 써서 만들어야 함.