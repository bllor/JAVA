package sub02;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	//동기화블럭
	public synchronized void setNum() {
		this.num++;
	}
}
