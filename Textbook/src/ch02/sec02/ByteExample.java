package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
				byte b1=-128; 
				byte b2=-30;
				byte b3=0;
				byte b4=12;
				//byte b5=128;을 하게 되면 type mismatch: cannot convert from int to byte라는에러가 뜨는데
				//byte의 범위인 -128~127을 벗어났기 때문
	}

}
