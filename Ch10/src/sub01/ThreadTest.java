package sub01;
/*
 * 날짜: 2023/07/03
 * 이름: 최동일
 * 내용: JAVA Thread실습하기
 */
/*
 * 스케줄링, 이벤트 처리와 같은 곳에 스래드가 녹아 있음
 * 스래드(Thread)
 * - 하나의 프로세스 안에서 실행되는 프로그램 실행모음
 * - 스레드는 동시에  실행되는 병행 실행
 * - Thread 클래스를 상속 받아 start 실행
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		//스레드 객체 생성
		SubThread st1 = new SubThread("sub1");
		SubThread st2 = new SubThread("sub2");
		
//		st1.run();
//		st2.run();
//		위와같이 매서드를 호출하면 단일 매서드가 되고 , start로 진행하게 되면 멀티 스레드 진행
		
		
		//자식 스래드 실행
		st1.start();
		st2.start();
//		main스레드가 진행되다가 start에서 추가 스래드가 진행이됨.
//		st1.start의 작업이 끝날 때까지 기다리지 않고
//		st2.start()를 시작하고, 끝날 때까지 기다리지 않고 for문 실행
//		st1,st2, main의 for문이 동시에 진행됨.
		
		
		//메인 스레드 진행
		for(int i = 1; i<10;i++) {
			
			try {
				Thread.sleep(1000);//thread의 진행속도를 1초로 만듬.sleep의 단위는 1ms로 1000ms = 1sec;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("main thread 실행");
		}
		
		System.out.println("Main Thread 종료");
	}
}
