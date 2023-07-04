package sub04;



import java.util.Arrays;
import java.util.List;

/*
 * 날짜 : 2023/07/04
 * 이름 : 최동일
 * 내용 : JAVA 필터 스트림 실습하기
 */
public class FilterStreamTest {

	public static void main(String[] args) {
		
		
		
		List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
//		List<Integer> numbers = new ArrayList<>();
//		numbers.add(1);
//		numbers.add(1);
//		numbers.add(1);
//		numbers.add(1);로 시작하는 것과 
//		위의 asList와 같다.
		
		System.out.println(numbers);
		
		//중복제거
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", "));
		System.out.print("\n");
		
		//숫자 5이상 데이터 필터링
		numbers
			.stream()
			.filter(num->num>=5)
			.forEach(num->System.out.print(num+","));
		System.out.print("\n");
//		numbers클래스에서 filter로 들어감
//		filter에서 5보다 큰지 아닌지 검사해서 큰 경우에만 새로운 스트림을 통해 나감.
//	
		
		//중복제거&짝수데이터(스트림은 파이프처럼 연결가능)
		numbers
		.stream()
		.distinct()
		.filter(num-> num%2==0)
		.forEach(num->System.out.print(num+","));
	
	}
}
