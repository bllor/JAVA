package sub04;
/*
 * 날짜: 2023/07/03
 * 이름: 최동일
 * 내용: JAVA DaemonThread 활용 실습하기
 */
/*
 * 데몬스레드(DaemonThread)
 * - 메인스레드를 보조하는 보조 스레드
 * - 메인스레드가 종료되면 데몬스레드도 같이 종료
 */
public class DaemonThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		subThread st = new subThread();
		st.setDaemon(true);//데몬스레드 설정
		
		st.start();
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);
			
			System.out.println("main thread 실행");
			
		}
		
		System.out.println("프로그램 종료");
		//메인스레드가 종료되었음에도 불구하고 subThread가 계속 진행이됨.
		//메인이 종료되면 다른 가지도 종료되게 만드는 것이 Daemon임
		//st.setDaemon(true);을 입력하게 되면 메인스레드가 종료되면 다 종료됨.
		//리눅스에서는 데몬을 백그라운드 서비스라고 함.
	}
}
