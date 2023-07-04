package sub05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.STRING;

/*
 * 날짜 : 2023/07/04
 * 이름 : 최동일
 * 내용 : JAVA 맵 스트림 실습하기
 */
/*
 * 맵 스트림
 * - 스트림 요소(컬렉션을 통해 들어오는 데이터=컬렉션원소)를 다른 요소로 변환 시키는 스트림
 * - map(), flatMap() 등
 */
public class MapStreamTest {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신",23));
		people.add(new Person("김춘추",21));
		people.add(new Person("장보고",33));
		people.add(new Person("강감찬",43));
		people.add(new Person("이순신",53));
	
	
		//map
		people
			.stream()
			.map((person)->person.getName())
			.forEach((name)->System.out.print(name+","));
		//people의 객체의 이름을 person으로 지정
		//객체의 이름만 뽑기
		System.out.println();
		
		List<String> list = Arrays.asList("1,2,3","4,5,6","7,8,9");
		System.out.print(list);
		System.out.println();
		//flat map
		//하나의 원소를 여러 개로 쪼갠다.
		list.stream().flatMap((str)->Arrays.stream(str.split(",")))//str은 문자열을 나타냄
		.forEach(num -> System.out.print(num+","));//숫자가 아니라 문자열 데이터임
		System.out.println();
		//flatMapToInt ->flatMap으로 쪼개진 데이터를 인트형으로 만들어줌
	
	int result =	list
						.stream()
						.flatMapToInt((str)->{
						String[] strArr = str.split(",");
						int[]nums = new int[strArr.length];
						
						for(int i =0;i<strArr.length;i++) {
							nums[i]= Integer.parseInt(strArr[i]);
						
						}
			
						return Arrays.stream(nums);
						}).sum();
	
	
	System.out.println("result :"+result);
	
	
	
	
	
	}
}
