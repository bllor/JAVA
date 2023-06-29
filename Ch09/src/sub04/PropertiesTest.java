package sub04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: JAVA Properties 실습하기
 */
/*
 * 프로퍼티(Properties)
 * - 문자열 데이터만 취급하는 key-value 자료구조 클래스
 * - 프로그램의 환경설정값을 저장할 때 많이 사용한다.
 * - 입출력스트림으로 데이터 입출력하는 자료구조 클래스
 */
public class PropertiesTest {

	public static void main(String[] args) {
		
		
		//프로포티 생성
		//컬렉션의 map은 key로 자료를 저장함
		//프로포티도 맵인터페이스를 구현함.
		//다만 key가 무조건 문자열이여야함.value도 일반적으로 문자열임
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		//System.out.println(prop);
		
		//prop를 파일로 만듬 -> 직렬화
		
		String path1 = "C:\\Users\\Java\\Desktop\\Fruit.properties";
		
		//메모장을 이용해서 파일을 읽을 수 있음
		
		
		
		
		//프로퍼티 파일로 저장하기
		try {
			FileOutputStream fos = new FileOutputStream(path1);
			prop.store(fos, null);
			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//프로퍼티 파일 읽기
		String target = "C:\\Users\\Java\\Desktop\\cities.properties";
		
		Properties propCitess = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCitess.load(fis);
			fis.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(propCitess);
		System.out.println("한국: "+propCitess.getProperty("kor"));
		System.out.println("미국: "+propCitess.getProperty("usa"));
		System.out.println("일본: "+propCitess.getProperty("jp"));
		
		
		System.out.println("프로그램 종료");
	}
}
