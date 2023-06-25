package sub05;

 class Sedan extends Car {

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc){
		super(name, color, speed);
		this.cc=cc;
	}
	
	
	public void speedTurbo(int speed) {
		//this.speed+=20;//부모님의 상속을 받았어도 private가 되어있어서 지금과 같은 형식으로 사용할 수 없다.
					   //부모클래스에서 private를 protected로 바꾸면 사용가능.	
		this.speed+=20;
	}
	
	public void show() {
		
		super.show();//부모의 매서드가 출력 
		//그냥 show만 하면 안되는가? -> 안됨. car에 show매서드가 있으므로 오버라이드 되지 않고 출력됨 -> cc만출력됨.
		System.out.println("배기량"+this.cc);
	}
	
}
