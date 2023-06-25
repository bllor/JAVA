package sub03;

public class Calc {
//외부에서 클래스를 사용하려고 하면 new를 해야한다.
//굳이 new를 해야할까?
//->단순한 클래스일 경우 new를 하지 않아도 될거 같은데, 그래서 싱글톤 객체로 나둠
//static을 이용하여 싱글톤을 사용
	
	
	//클래스 내에서 자신을 객체로 생성을 함.정적클래스로 만듬
	private static Calc instance= new Calc();
	
	//instance를 외부에서 참조할 수 있도록 getter를 사용
	
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {}
	//위와 같이 하면 
	
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
	public int multi(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x%y;
	}
	
	
	
}
