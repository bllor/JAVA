package sub03;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2023/07/04
 * 이름 : 최동일
 * 내용 : JAV 람다식 실습하기
 */
/*
 * 스트림(Stream)
 * - 컬렉션 원소를 람다식으로 일괄처리(batch)할 수 있는 API
 * - 내부적으로 병렬처리를 수행하여 대용량 데이터 처리에 더 나은 성능을 제공
 */
public class CollectionStreamTest {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		
		// 외부반복자를 이용한 출력
//		for(String name : names) {
//			System.out.println("name : "+name);
//		}
//		
//		
//		//내부반복자 이용한 출력
//		Stream<String>stream = names.stream();
//		stream.forEach((name)->{System.out.println("name : "+name);});//foreach와 같은 함수가 api이다.
		//성능적인 측면에서는 외부는 메인 스레드 내부는 내부스레드 이용 내부가 좀 더 효율적임
		

		
		List<Person>people = new ArrayList<>();
		people.add(new Person("김유신",23));
		people.add(new Person("김춘추",21));
		people.add(new Person("장보고",33));
		people.add(new Person("강감찬",43));
		people.add(new Person("이순신",53));
		
		
		//외부반복자 이용
		for(Person p : people) {
			System.out.println("이름 : "+p.getName()+" ,나이 : "+p.getAge());
		}
		
//		Stream<Person> p = people.stream();
//		p.forEach((person)->{System.out.println("이름 : "+people.getName()+" ,나이 : "+people.getAge());});
//		실행이 안됬던 이유는 변수를 person으로 받기로 했는데 list에게서 이름을 호출했기 때문
		
		Stream<Person> stream2 =people.stream();
		stream2.forEach((p)->{System.out.println("이름 : "+p.getName()+" ,나이 : "+p.getAge());});
	}
}










