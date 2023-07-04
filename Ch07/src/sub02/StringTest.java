package sub02;
/*
 * 날짜: 2023/06/27
 * 이름: 최동일
 * 내용: Java String 클래스 실습하기
 */
/*
 * String클래스
 * -String 문자열을 처리하는 클래스
 * -문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 * -String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용
 */
public class StringTest {

	public static void main(String[] args) {
		
		
		//문자열 생성
		
		String str1 = " Hello"; //str1은 참조변수 hello는 객체/암시적
		String str2 = new String("Hello");//위와  같다./명시적

	
		System.out.println(str1);
		System.out.println(str2);

		//기본변수의 갑은 stack에 바로 저장이 되지만
		//참조변수인 문자열은 stack에 주소값이 저장이 되고,  heap에 값이 남있다.
		//문자가 서로 같지만 참조변수, 객체끼리 달라서 같다고 하기 힘듬
		//heap안에 있는 수를 비교할 때 사용하며 equal을 사용한다.
		
		if(str1==str2) {//이것은 주소를 비교하는 연산자
			System.out.println("str1과  str2가 같다.");
		}else {
			System.out.println("str1과  str2가 다르다.");

		}
		if(str1.equals(str2)) {//값을 비교하기 위해 재정의 한다.
			System.out.println("str1과  str2가 같다.");
		}else {
			System.out.println("str1과  str2가 같다.");
			System.out.println("------------------------");
			
			//문자열 길이
			
			String msg= "Hello Korea";//문자열의 길이는 문자의 개수
			System.out.println("msg의 길이: "+msg.length());
			//문자열 추출
			System.out.println("msg의 첫 번째 문자: "+msg.charAt(0));
			System.out.println("msg의 첫 번째 문자: "+msg.charAt(6));
			//인덱스 번호는 0부터 시작하기 때문에 7번째 숫자를 출력하기 위해서는 6을 넣어야한다
			
			//문자열 자르기
			
			String sub1 = msg.substring(0,5);//msg의 0~5까지 잘라서 저장하라.
			System.out.println(sub1);
			
			String sub2= msg.substring(6); //인덱스번호 6번부터 마지막까지 출력하라.
			System.out.println(sub2);
			String sub3= msg.substring(6,8);
			System.out.println(sub3);
			
			//문자열 인덱스
			
			int idx1 = msg.indexOf("e");
			//msg에서 e의 인덱스 번호를 출력.
			int idx2 = msg.lastIndexOf("e");
			//e의 인덱스 번호를 뒤에서부터 찾음.
			System.out.println("idx1: "+idx1);
			System.out.println("idx2: "+idx2);
			
			//문자열 교체
			
			String rs1 = msg.replace("Korea", "Busan");
//			replace(기존문자열,새로운 문자열) -> 기존 문자열을 새로운 문자열로 바꿔서 저장
			String rs2 = msg.replace("Hello", "Welcome");
			
			System.out.println("rs1 : "+rs1);
			System.out.println("rs2 : "+rs2);
			
			//문자열 변환
			//기본 변수의 값들을 문자열로 전환
			int var1= 1; // "1"로 만들고 싶음
			double var2 = 3.14;
			boolean var3= true;
			
			String s1 = String.valueOf(var1);//valueof는 String클래스에서 바로 사용되는 메서드로 정적메서드이다.
			String s2 = String.valueOf(var2);
			String s3 = ""+var3; //이것 처럼 하게 되면 true가 "true"가 됨.
			
			System.out.println("s1 : "+s1);
			System.out.println("s2 : "+s2);
			System.out.println("s3 : "+s3);
			
		}
	}
}
