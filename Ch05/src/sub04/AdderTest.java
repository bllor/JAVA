package sub04;
/*
 * 날짜: 2023/06/20
 * 이름: 최동일
 * 내용: 싱글톤 객체와 인스턴스 객체 실습
 */


class Adder{

	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	private Adder() {}//private를 한 번더 선언하게 된다면 new를 사용하여 객체를 생성할 수 없다. Adder를 호출하지 못하게 막는다.
	private Adder(int value) {
		y+=value;
	}

	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x+=x;
		y++;
	}

	public void add(int[]arr) {//add는 오버로딩 //생성자 메서드는 클래스의 이름과 같은것
		x+=arr[0];
		y+=arr[1];
	}

	public static void add(Adder a2) {//참조변수 선언
		a2.x +=10;
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
	
	
}




public class AdderTest {

	
	public static void main(String[] args) {
		
//		Adder a1= new Adder();가 안됨.a1 new를 막아놨기 때문
		Adder a1= Adder.getInstance();
		
		a1.add(1,2);
		//얘가 입력되면 instance값이 들어와서 add(int x, int y)에 들어감
		//this.x+=x; 0+1;
		//y++; y가 2가 되어도 이 지역에서 빠지면 외부값에 저장된 것이 아니므로 날아감.
		a1.show();
		//this.x를 함으로써 x값에 1이 들어가고 y는 정의되지 않으므로 0으로 출력이 된다.
		
		System.out.println("-------------------");
		
		
		int[]arr= {10,20};//heap에 생성됨.
		a1.add(arr);
		a1.show();
		System.out.println("-------------------");
		
		Adder.add(a1);//정적매서드를 호출
		a1.show();
		//a2는 a1이 됨.
		//a1.x는 11인데 a1.x+=10 은 a1.x+10이라는 뜻으로 21이 된다.
		
		System.out.println("-------------------");
		
		a1= Adder.add(a1, 3);
		a1.show();
		//매게변수 a3과 value가 들어옴
		//a3에는 a1이 ,value에는 3이 들어옴.
		//a3은 heap에 있는 것을 가르킴 -> new 가 실행이 되고 x=0, y=0으로 됨
		///y=3,x=0이 되고 이 참조변수의 값이 a1에 저장이 됨
		
		//Adder.add(a1,3) return new Adder(3) -> private Adder(3) -> y+=value; 
		//adder가 새로 선언된다. -> y=0, x=0;; y에는 3이 들어가고 x에는 아무 값이 없어서 0이 나온다.
		
		
		
	}
}
