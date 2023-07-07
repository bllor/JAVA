package sub01;
//작업 스레드로 진행시킬것임
//Thread라는 클래스를 상속 받아야 함
public class SubThread  extends Thread{

	private String name;
	public SubThread(String name){
		this.name = name;
	}
	
	
	
	@Override
	public void run() {
		
		for(int i= 0;i<10;i++) {
			System.out.println(name+"스레드 실행...");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println(name+"스레드 종료");
		
	}
}
