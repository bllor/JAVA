package sub02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 날짜:2023/07/06
 * 이름:최동일
 * 내용:소켓 프로그래밍 실습하기
 */
public class SocketClient {

	public static void main(String[] args) {
		System.out.println("[Client]");
		
		
		
		Socket socket = null;
		
		socket = new Socket();
		
		System.out.println("연결요청");
		try {
			socket.connect(new InetSocketAddress("127.0.0.1",5001));
			
			System.out.println("연결성공");
			
		//데이터 송신(클라이언트 -> 서버)
		OutputStream os = socket.getOutputStream();
		String msg = "Hello Server";
		
		byte[] msgBytes=msg.getBytes();//문자열은 byte로 변환
		os.write(msgBytes);
		os.flush();
		System.out.println("데이터 송신 완료...");
			
		
		//데이터 수신(서버 -> 클라이언트)
		InputStream is =socket.getInputStream();
		byte[] bytes= new byte[100];
		int readBytes = is.read(bytes);
		
		String result = new String(bytes,0,readBytes, "utf-8");
		System.out.println(result);
	
		System.out.println("데이터 수신완료");
		
		os.close();
		is.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Client 종료");
	}
}
