package confirm.ch06;

import java.util.Scanner;

/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 6장 확인문제
 */
class Account{
	private String id;
	private String name;
	private int balance;
	
	
	public Account(String id, String name,  int balance) {
		this.id = id;
		this.name= name;
		this.balance= balance;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		return id+"\t"+name+"\t"+balance;
	}
}


public class Test20 {

	public static void main(String[] args) {
		//bank application
		
		
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[100];
		
		while(true) {
			
			
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------------");
			
			System.out.print("선택>");
			int answer= sc.nextInt();
			
			if(answer==1) {
				System.out.println("--------------");
				System.out.println("계좌생성");
				System.out.println("--------------");
				System.out.print("계좌번호 : ");
				String id=sc.next();
				System.out.print("계좌주 : ");
				String name=sc.next();
				System.out.print("초기입금액 : ");
				int balance=sc.nextInt();
				
				
				Account account = new Account(id,name,balance);
				for(int i = 0; i<accounts.length;i++) {
					
					if(accounts[i]==null){
						accounts[i]=account;
						System.out.println("결과 :  계좌가 생성되었습니다.");
						break;
					}
				}
				
				
			}if(answer==2) {
				System.out.println("--------------");
				System.out.println("계좌목록");
				System.out.println("--------------");
				
				for(Account account: accounts) {
					if(account !=null) {
						System.out.println(account);
					}
				}
				
				
			} if(answer==3) {
				System.out.println("--------------");
				System.out.println("예금");
				System.out.println("--------------");
				System.out.print("계좌번호 : ");
				String id1=sc.next();
				System.out.print("초기입금액 : ");
				int balance2=sc.nextInt();
				
				for(int i =0; i<accounts.length;i++) {
					
				}
				
			} if(answer==4) {
				System.out.println("--------------");
				System.out.println("출금");
				System.out.println("--------------");
				
			} if(answer==5) {
				
				System.out.println("프로그램종료"); 
				break;
			}
		
		
		
		}
		sc.close();
		
	}
}
