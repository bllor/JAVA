package sub04;

public class subThread extends Thread{

	@Override
	public void run() {
	
		while (true) {
		
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("subThread 실행 ....");
		}
		
	}
}
