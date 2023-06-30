package sub01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: JAVA 파일 입출력 스트림 실습하기
 */
/*
 * I/O라고 함음 Input과 Output을 말한다.
 * 
 * 입출력스트림(Streams)
 * -프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행
 * -파일 입출력을 위해 스트림(데이터 연결 통료)사용
 */
public class FileIOTest {

	public static void main(String[] args) {
		
		String path ="C:\\Users\\Java\\Desktop\\Sample1.txt";
		String target ="C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		try {
			
			//스트림생성
			FileInputStream fis = new FileInputStream(path);
			
			
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				
			//파일읽기
			int data = fis.read();
			
			if(data==-1) {
				break;
			}
			//System.out.print(data);
			
			
			//숫자를 문자로 변경
			char ch = (char) data;
			System.out.print(ch);
			//한글은 글자가 깨져서 안됨
			
			
			//파일 내보내기
			fos.write(data);
			
		}
			//스트림 해제
			fis.close();//파일 닫기
			fos.close();
			
		} catch (FileNotFoundException e) {//read에러 
			e.printStackTrace();
		} 
			catch( IOException e) {//write 에러를 막기위해 만듬. 
			e.printStackTrace();
		}
			
		//객체 이름을 네이밍할 때 대문자만 따서 하는 경우도 있다.		
		//fileinputstream은 예외처리를 해줘야 사용할 수 있음 파일이 없을 수도, 이름이 잘못됬을 수도 있으니까
		//Unhandled exception type FileNotFoundException예외를 다루지 않았다는 뜻
		//sample이 파일이고 이클립스가 파일을 프로그래밍하는 프로그램
		
				
				
				
				
				
				System.out.println("프로그램 종료");
	}
}
