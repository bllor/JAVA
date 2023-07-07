package sub02;
/*
 * 날짜: 2023/07/03
 * 이름: 최동일
 * 내용: JAVA Thread 동기화 실습하기
 */
/*
 * 
 * 동기화 블럭 : 스레드간의 경합을 막고 동기방식으로 실행하는 것
 * -블럭 앞에 synchronized를 선언하면 동기화 블럭이 된다.
 * 
 * 동기, 비동기
 * -동기방식은 순서를 지키며 처리되는 처리 흐름
 * -비동기방식은 순서를 지키지 않고 처리되는 실행 흐름
 */
public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		//자식스래드 실행(비동기 방식)
		ct1.start();
		ct2.start();
		ct3.start();
		//동시에 진행 중인 ct1,ct2,ct3의 작업이 끝날 때가지 main스래드가 기다려야 원하는 값이 나옴
		//기다리게 하는 것은 join
		
		
		//자식 스레드 작업이 완료 후 다시 메인 스레드로 합류(스래드 대기)
		ct1.join();
		ct2.join();
		ct3.join();
		//join을 해도 값이 일정하게 나오지 않을 때도 있는데
		//countthread이 비동기 방식이 되어있기 때문.
		
		
		System.out.println("count : "+count.getNum());
		//이렇게 했을 때 0이 나왔는데
		//main스레드는 자식스래드가 연산을 하고 있을 때 끝내버려서 count가 0이 나옴
		//값은 계속 바뀜
		
		
/*
 * 메모리 상황
 * 1.stack에 count가 선언됨
 * 2.heap에 count가 생성되고 주소를 가짐.num이 0을 가짐
 * 3.st1,st2,st3가 stack에 생성됨.
 * 4.countThread 3개가 heap에 생성이 되고 각각 주소값을 가지며 st1,st2,st3에 배정이 됨.
 * 5.countThread에는 각각 count가 있는데 2에 생성된 count를 참조함.
 * 6.countThread에 존재하는 count가 진행됨
 * 7.순서를 정해놓지 않으면 경합과정에서 동시에 진행이되어, 한 번만 count에 입력이 됨.
 */
		
	
	}
}
