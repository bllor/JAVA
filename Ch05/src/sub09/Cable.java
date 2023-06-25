package sub09;

public class Cable implements Socket{
//cable에서 스위치 작동을 제어하는 것이 나은 것 같음
	
	private Bulb bulb;
	public Cable(Bulb bulb) {
		this.bulb= bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
		
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}

}
