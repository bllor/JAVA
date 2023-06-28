package sub03;
/*
 * 날짜: 2023/06/28
 * 이름: 최동일
 * 내용: Java 자료구조 리스트 실습하기
 */
/*
 * List
 * - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
 * - List를 구현한 ArrayList
 */
import java.util.ArrayList;
import java.util.List;




public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();//list는 Arraylist를 구현 이렇게 선언하면 다형성 적용
		//arraylist<Integer> list =new ArrayList<>();와 같다.
		
		//데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);//이렇게 하면 list에 toString을 호출함

		
		//데이터 삽입
		list.add(1,6); //인덱스번호 1번에 6을 삽입한다 나머지 인덱스 번호들은 뒤로 밀림

		System.out.println(list);
		
		//데이터 삭제
		list.remove(2);//인덱스번호 2를 삭제함.
		
		System.out.println(list);
		
		
		//데이터 출력
		System.out.println("list의 1번 째 원소: "+ list.get(0));//인덱스번호 0에 있는 값을 출력.
		System.out.println("list의 2번 째 원소: "+ list.get(1));
		System.out.println("list의 3번 째 원소: "+ list.get(2));
		System.out.println("list의 4번 째 원소: "+ list.get(3));
		System.out.println("list의 5번 째 원소: "+ list.get(4));
		
		
		//리스트 크기
		System.out.println("리스트의 크기 : "+list.size());
	
	
		//리스트 반복문
		for(int num:list) {//언박싱되면서 출력됨.list에는 객체 클래스가 들어가있으므로.
			System.out.println(num);
		}
	
		
		
		//문자열 리스트
		List<String> people= new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println("people :"+people);
		
		
		//객체 리스트(자바에서는 객체를 이해해야 한다.)
		//객체를 클래스를 인스턴스로 생성.
		//다른 패키지에 있는 클래스를 참조하려면 import선언이 되어야 한다.
		
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 4000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본",1000));
		
		
	
		
		Apple apple =apples.get(0);
	
		apple.show();
		
		
		apples.get(1).show();
		apples.get(2).show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
