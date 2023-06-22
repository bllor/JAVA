package sub08;

 public  class Sedan extends Car {
	 //추상클래스에서 상속을 받았다고 에러가 뜨는데
	 //abstract가 되어 있는 메서드를 구축해야만 에러가 뜨지 않는다.
	 private int cc;
	 
	 public Sedan(String name, String color, int speed, int cc) {
		 super(name,color,speed);
		 this.cc=cc;
		 
	 } 
	 public void speedTurbo(int speed) {
		 this.speed +=20;
	 }
	 
	 public void show() {
		 super.show();
		 System.out.println("배기량 :"+this.cc);
	 }
	 
	 @Override
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	 
	@Override
	public void speedDown(int speed) {
		this.speed-=speed;
	}
}
