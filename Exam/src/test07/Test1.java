package test07;
/*
 * 날짜: 2023/07/20
 * 이름: 최동일
 * 내용: 확인문제 1번
 */
class Box{
	private double width;
	private double height;
	private double depth;
	public Box(double width, double height, double depth) {
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double volume() {
		return width*height*depth;
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Box box1 = new Box(1, 2, 3);
		Box box2 = new Box(3, 6, 9);
		
		System.out.println("box1의 부피: "+box1.volume());
		System.out.println("box2의 부피: "+box2.volume());
	}
	
}
