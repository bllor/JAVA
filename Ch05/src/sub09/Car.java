package sub09;

public interface Car {
	//interface에서는 오직 메서드만 선언
	//속성같은 것 없음
	public abstract void speedUp(int speed);
	
	public abstract void speedDown(int speed);
	
	public void show();//인터페이스에서는 abstract생략가능 
					   //추상 메서드만 사용이 가능하니까
}
