package sub02;

public class CountThread extends Thread {

	private Count count;
	
	public CountThread(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
	
	
		for(int i=1;i<=100;i++) {
			count.setNum();
			//여기에 스래드가 3개가 들어옴 st1,st2,st3
			//스레드가 병행실행되면서 count.setNum에 3개의 스레드가 들어옴
			//만약 첫 번째 스레드가 진입하면 나머지 스레드는 들어오지 못하도록 대기를해야함
			//같이 실행이 되면 연산의 결과가 부정확해진다.
			//하나의 스레드만 진입할 수 있도록 동기화(순서정하기)를 해야한다.
			//synchronized를 입력하면 순서가 정해진다.
			
		}
	
	}
}
