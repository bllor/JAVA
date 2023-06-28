package sub05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜: 2023/06/28
 * 이름: 최동일
 * 내용: Java 자료구조 Map 실습하기
 */
/*
 * 맵(Map)
 * - 키-값(Key-Value) 쌍으로 이루어진 자료구조
 * - Map을 구현한 HashMap
 */
public class Maptest {

	public static void main(String[] args) {
		
		 //Map생성
		
		Map<Character,String> map = new HashMap<>();
		
		//데이터 입력
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		//맵의 크기
		
		System.out.println("map의 크기 : "+map.size());
		
		
		//개별적으로 데이터 출력
		System.out.println("map A값 : "+map.get('A'));
		System.out.println("map B값 : "+map.get('B'));
		System.out.println("map C값 : "+map.get('C'));
		
		
		//반복문 출력
		for(char k : map.keySet()) {// map.keySet() 맵의 키들을 집합으로 만듬.
			System.out.println(k+"-"+map.get(k));
			
		}
		
		
		
		//List-Map 응용
		
		// list선언
		List<Map<Integer, Apple>> list = new ArrayList<>();//map m1,m2,m3를 넣으려면 그들의 타입을 list<>안에 넣어야 한다.
		
		//Map선언
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 4000));
		m1.put(103, new Apple("일본", 2000));
		
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 4000));
		m2.put(203, new Apple("호주", 2000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 4000));
		m3.put(303, new Apple("홍콩", 2000));
	
	
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		System.out.println("--------------------");
		
		//한국사과
		System.out.println(list.get(0).get(101));
		
//		System.out.println(list.get(0).get(101));에서
//		list.get(0)은 리스트의 인덱스 번호 0을 가지고 있는값을 가져옴 ->m1
//		list.get(0).get(101)은 인덱스 번호 0에서 key로 101를 가진 값을 가져옴 ->한국사과
//		그래서 한국사과가 출력된다.
		
		Map<Integer, Apple> m =list.get(0);
		Apple a = m.get(101);
		a.show();
		
		//호주사과
		
		System.out.println(list.get(1).get(203));
		
		list.get(1).get(203).show();
		
		//태국사과
		
		System.out.println(list.get(2).get(302));
	}
}
