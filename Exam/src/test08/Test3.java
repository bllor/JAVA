package test08;
/*
 * 날짜: 2023/07/21
 * 이름: 최동일
 * 내용: 자바 총정리 연습문제 8
 */

class Member{
	private String name;
	private String hp;
	private int age;
	
	public Member(String name, String hp, int age) {
		
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name+","+hp+","+age;
		}
	
}

public class Test3 {

	public static void main(String[] args) {
		
		Member m1 = new Member("김유신", "010-1234-1001", 25);
		Member m2 = new Member("김춘추", "010-1234-1002", 23);
		
		System.out.println(m1);
		System.out.println(m2);
	}
}
