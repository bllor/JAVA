package sub03;


import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜: 2023/07/06
 * 이름: 최동일
 * 내용: 채팅프로그램 실습하기
 */
public class ChatServer {

	public static void main(String[] args) {
		
		System.out.println("[server]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			System.out.println("연결대기");
			
			socket = serverSocket.accept();
			
			System.out.println("연결수립");
			
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadReceiver(socket);
			
			t1.start();
			t2.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
