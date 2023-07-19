package confirm.ch06;
/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 6장 확인문제
 */

class Account1{
	private  int balance;
	static final int MAX_BALANCE=1000000;
	static final int MIN_BALANCE=0;

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		
		if(balance>MIN_BALANCE&&balance<MAX_BALANCE) {
			this.balance = balance;
		}
	}
}
public class Test19 {

	public static void main(String[] args) {
		Account1 acc= new Account1();
		
		acc.setBalance(10000);
		System.out.println("현재잔고: "+acc.getBalance());
	
		acc.setBalance(-100);
		System.out.println("현재잔고: "+acc.getBalance());
		
		acc.setBalance(20000000);
		System.out.println("현재잔고: "+acc.getBalance());
		
		acc.setBalance(30000);
		System.out.println("현재잔고: "+acc.getBalance());
		
	
	}
}
