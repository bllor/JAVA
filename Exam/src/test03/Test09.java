package test03;
/*
 * 날짜: 2023/06/23
 * 이름: 최동일
 * 내용: 추상클래스, 다형성 연습문제
 */


abstract class Shape{
	public abstract void draw();
}


class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Triangle");
	}
}

class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("draw Circle ");
	}
}
public class Test09 {

	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
		
	}
	
	public void draw(Shape obj) {//이렇게 사용이 될까? 사용되는듯
		obj.draw();
	}
}
