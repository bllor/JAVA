package sub01;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜:2023/07/06
 * 이름:최동일
 * 내용:http 통신 실습하기
 * ->서버에 요청하고 응답받기
 */
public class HttpTest {

	public static void main(String[] args) {
		//네이버나 다음은 응답이 안되서 구글로 할 예정
		
		FileOutputStream fos = null;
		BufferedReader br= null;
		
		try {
			URL url = new URL("http://google.com");
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			fos = new FileOutputStream("./result.txt");
			
			String line = null;
			
			while((line=br.readLine())!= null) {
				
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
			br.close();
			fos.close();
			
		} catch (MalformedURLException e) {//잘못된 url일 경우 사용하는 url
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
//이 프로그램으로 네이버를 요청하였는데, 네이버는 보안적인 차원에서 막아놓음
//무한 요청이 가능하므로
//자바로 http통신 처리가능
