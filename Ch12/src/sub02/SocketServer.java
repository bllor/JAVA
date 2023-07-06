package sub02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜:2023/07/06
 * 이름:최동일
 * 내용:소켓 프로그래밍 실습하기
 */
public class SocketServer {

	public static void main(String[] args) {
		
		System.out.println("[Server]");

		
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1",5001));//입력주소
			
			System.out.println("연결대기");
			Socket socket = serverSocket.accept();//accept이 될 때까지 계속 루핑
			
			System.out.println("연결수립");
			// 데이터 송신(서버-> 클라이언트)
			OutputStream os = socket.getOutputStream();//연결이 되어서 socket이 생성 /서로연결되어있음
			String msg = "Hello Client!";//클라이언트의 소켓에 보내어질 값
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("데이터 송신 완료");
			
			
			//데이터 수신(고객->서버)
			
			InputStream is =socket.getInputStream();
			byte[] bytes = new byte[100];//일종의 버퍼			
			int readBytes= is.read(bytes);//바이트의 크기만큼 받아오겠다
			
			String result = new String(bytes,0,readBytes,"utf-8");//바이트는 크기, READBYTES를 UTF-8로 읽음
			System.out.println(result);
			
			System.out.println("데이터 수신 완료");
		
			os.close();
			is.close();
			socket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("[Server 종료]");
	}
}
