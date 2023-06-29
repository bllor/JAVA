package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: JAVA Buffer입출력 스트림 실습하기
 */
/*
 * 보조스트림(버퍼)
 * -기본 입출력 스트림에 Buffer를 장착해서 빠른 입출력을 지원하는 보조 스트림
 */
public class BufferIOTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\Workspace.zip";
		String target = "C:\\Users\\Java\\Desktop\\Workspace2.zip";
		//보조스트림을 사용하지 않으면  workspace의 파일이 클경우 
		//내보내는 과정이 엄청 늦게 된다.
		
		
		try {
			//스트림 생성
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림 사용
			//단독으로 사용하지 못함.
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			while(true) {
				
				//int data = fis.read();
				//보조스트림 읽기
				int data = bis.read();
				
				if(data == -1) {
					break;
				}
//				char ch = (char)data;
//				System.out.print(ch);
				
				//fos.write(data);
				//보조스트림 보내기
				bos.write(data);
											
			}
			//스트림 해제
			
			bis.close();
			
			bos.flush();//버퍼 비우기
			bos.close();
			
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
