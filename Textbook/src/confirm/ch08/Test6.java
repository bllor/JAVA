package confirm.ch08;
/*
 * 날짜: 2023/07/21
 * 이름: 최동일
 * 내용: 8장 연습문제
 */

interface Soundable{
	public String sound();
	
}



class Cat  implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "야옹";
	}
	
	 Cat() {
		 sound();
	}
}	

class Dog implements Soundable{
	
	
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "멍멍";
	}
	
	Dog(){
		sound();
	}
}

	
	


public class Test6 {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		
		
		printSound(new Cat());
		printSound(new Dog());
	
	}
}
