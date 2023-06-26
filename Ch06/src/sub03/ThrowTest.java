package sub03;
/*
 * 날짜: 2023/06/26
 * 이름: 최동일
 * 내용: Java Throw(예외발생시키기) 실습하기
 */

//사용자 정의 예외클래스
//특수한 목적으로 만든 예외클래스
class MinusException extends Exception{
	
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception{
	
	public OverException(String msg) {
		super(msg);
	}
}

class Score{
	
	public void check(int score) throws MinusException, OverException{//throws Exception을 하게 되면 하나만 적어도 됨.
																	  //MinusException, OverException가 Exception을 상속 받기 때문
		
		if(score<0) {
			//예외를 발생시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
			//위의 코드는 던지는 것이므로 클래스에 throws가 필요하다.
		}else if(score>100) {
			throw new OverException("점수는 100점을 초과할 수 없습니다.");
		}else {
			System.out.println("점수가 정상입니다.");
		}
	}
}

public class ThrowTest {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
		score.check(-3);
		score.check(1000);
		score.check(96);
		//한번에 해놓으면 에러가 발생하는 순간 바로 try문을 빠져나감
		//따로따로 해야되면 try catch문을 따로따로 만들어야함.
		}catch(MinusException e) {
			e.printStackTrace();
		}catch(OverException o) {
			o.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료.");
	}
}
