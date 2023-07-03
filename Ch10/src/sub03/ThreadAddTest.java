package sub03;
/*
 * 날짜: 2023/07/03
 * 이름: 최동일
 * 내용: JAVA Thread 활용 실습하기
 */
public class ThreadAddTest {

	public static void main(String[] args) throws InterruptedException {
		
		//runnable 인터페이스 구현클래스
		AddThread at1 = new AddThread(1,50);
		AddThread at2 = new AddThread(51,100);
		//at1과  at2를 합치면 1~100까지의 합

		
//		at1.start();가 안됨. 
//		runnable인터페이스로 실행했으므로
//		그래서 스레드 객체가 필요함
		
		//runnable 구현 클래스를 Thread 객체로 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);

		//스레드 실행
		t1.start();
		t2.start();
		
		//스레드 대기(다른 스레드 종료를 대기)
		t1.join();
		t2.join();
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		int total = tot1+tot2;
		
		System.out.println("total is "+total);
	
	}
}
