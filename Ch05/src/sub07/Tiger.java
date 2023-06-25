package sub07;

public class Tiger extends Animal {
	
	//애니멀의 속성이 없어서 따로 재정의해줄 필요가 없다.
	
	@Override
	public void move() {
		
		System.out.println("Tiger run...");
	}
	
	@Override
	public void hunt() {
		System.out.println("Tiger Hunt...");
	}
	
	
}
