package test04;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜: 2023/06/30
 * 이름: 최동일
 * 내용: 객체리스트 연습문제
 */


class Member{
	String id;
	String name;
	int age;
	
	 Member(String id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return id+","+name+","+age;
		
		//객체의 정보문자 출력
	}
}

public class Test09 {

	
	public static void main(String[] args) {
		
		Member m1 = new Member("hong", "홍길동", 30);
		Member m2 = new Member("lee", "이순신", 40);
		Member m3 = new Member("kim", "김유신", 50);
		
		List<Member>memberlist = new ArrayList<>();
		memberlist.add(m1);
		memberlist.add(m2);
		memberlist.add(m3);
		
		for(Member m : memberlist) {
			System.out.println(m);
//			m을 했을 때 바로 출력되는데
//			toString이 생략되었다고 생각.
//			원래는m.toString
		}
	}
}
