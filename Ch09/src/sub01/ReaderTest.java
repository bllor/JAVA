package sub01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: JAVA 문자 스트림 실습하기
 */
/*
 * 문자스트림
 * -아시아권 문자를 위한 문자 전용 스트림
 * -유니코드 기반으로 UTF-8 인코딩으로 아시아권 문자 인코딩 처리
 */
public class ReaderTest {

public static void main(String[] args) {
		
		String path ="C:\\Users\\Java\\Desktop\\Sample1.txt";
		String target ="C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		try {
			//스트림생성
			
			
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter(target);
			
			
			while(true) {
				
				//파일일기
			int data = fr.read();//그냥할 시 에러가 나서 catch를 해야함
			
			if(data==-1) {
				break;
			}
			
			char ch = (char) data;
			System.out.print(ch);
			
			
			
			fw.write(data);
			
		}
			//스트림 해제
			fr.close();//파일 닫기
			fw.close();
			
		} catch (FileNotFoundException e) { //밑의 catch를 만들지 않고 catch(exception 변수명)e를 해야함.
			e.printStackTrace();
		} catch( IOException e) {//1. catch를 병렬로 연결
			e.printStackTrace();
		}
			
		//객체 이름을 네이밍할 때 대문자만 따서 하는 경우도 있다.		
		//fileinputstream은 예외처리를 해줘야 사용할 수 있음 파일이 없을 수도, 이름이 잘못됬을 수도 있으니까
		//Unhandled exception type FileNotFoundException예외를 다루지 않았다는 뜻
		//sample이 파일이고 이클립스가 파일을 프로그래밍하는 프로그램
		
				
				
				
				
				
				System.out.println("프로그램 종료");
	}
}
