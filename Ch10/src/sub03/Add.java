package sub03;

import java.util.Set;

public class Add {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	public  synchronized void setNum(int num) {
		this.num += num;
	}
	//여기서는 동기화처리가 필요없음
	//범위가 달라서 그런가?
	//서로 다른 객체의 필드라서 경합될 일이 없음
	//interface상속으로 인해서 서로 다른객체의 필드가 되었음
	
	
	
	//get,set을 한두 Ctrl+space를 하면 바로 만들 수 있음

}
