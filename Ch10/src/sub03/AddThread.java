package sub03;

public class AddThread extends Add implements Runnable {
//add클래스를 상속 받아서 thread클래스를 상속받을 수 없는데 runnable라는 인터페이스를 실행함으로써 thread기능인 run을 사용.


	private int start;
	private int end;
	
	public AddThread(int start, int end) {
		this.start= start;
		this.end = end;
	}
	
	@Override
	public void run() {
		
		for(int k=start; k<=end;k++) {
			setNum(k);
		}
		
	}

}
