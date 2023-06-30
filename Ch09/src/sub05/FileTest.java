package sub05;

import java.io.File;
import java.io.IOException;

/*
 * 날짜: 2023/06/30
 * 이름: 최동일
 * 내용: Java File 클래스 실습하기
 */
/*
 * 파일클래스
 * - File 클래스는 파일에 대한 경로나 정보를 조히할 때 사용하는 클래스
 * - 별도의 입출력기능이 없어 스트림을 통한 데이터 입출력
 * - File 클래스로 데이터 입력 못함.
 */
public class FileTest {

	public static void main(String[] args) {
		
		
		File f1 = new File("C:\\Users\\Java\\Desktop\\file1.txt");
		File f2 = new File("../../../../../file2");//폴더
		
		
		
		
		
		try {
			//파일생성
			f1.createNewFile();
			//폴더생성
			f2.mkdir();
			
			
			//파일 구분 확인
			
			System.out.println("f1 isFile : "+ f1.isFile());
			System.out.println("f1 isDirectory : "+ f1.isDirectory());
			System.out.println("f2 isFile : "+ f2.isFile());
			System.out.println("f2 isDirectory : "+ f2.isDirectory());
			System.out.println("f1 getName : "+ f1.getName());
			System.out.println("f2 getName : "+ f2.getName());
			System.out.println("f1 getAbsolutePath : "+ f1.getAbsolutePath());
			System.out.println("f2 getAbsolutePath : "+ f2.getAbsolutePath());
			System.out.println("f1 getPath : "+ f1.getPath());
			System.out.println("f2 getPath : "+ f2.getPath());
			//is, has로 시작하는 메서드들은 boolean값으로 리턴하는 함수
			//AbsolutePath 절대 경로 시스템 상에 위치하는 경로 c드라이브부터 시작
			//getPath는 현재 위치에서 f2,f1이 위치는 경로를 나타냄
		
			//파일 삭제
			f1.delete();
			f2.delete();
			
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
