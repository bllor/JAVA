package ch02.sec10;
/*
 * 날짜: 2023/6/16
 * 이름: 최동일
 * 내용: 문자열을 기본타입으로 변환&기본타입을 문자열로 변환
 */
public class PrimitiveAndStringConversionExample {

		public static void main(String[] args) {
//		1.문자열을 기본타입으로 변환
//		-변환하고 싶은타입 변수명 =변환하고싶은타입.parse변환하고싶은타입("");ㅣ
//		 EX) int X1 = Integer.parseInt("10");	
			
			
			int x1 = Integer.parseInt("10");
			double x2 = Double.parseDouble("3.14");
			boolean x3 = Boolean.parseBoolean("true");
			System.out.println("x1 : "+x1);
			System.out.println("x2 : "+x2);
			System.out.println("x3 : "+x3);
//			System.out.println("x1+x2+x3"+(x1+x2+x3));서로 형식이 달라서 안됨.
		
			String s1= String.valueOf(10);
			String s2= String.valueOf(3.14);
			String s3= String.valueOf(true);
			System.out.println("s1 : "+s1);
			System.out.println("s2 : "+s2);
			System.out.println("s3 : "+s3);
			System.out.println("s1+s2+s3 : "+(s1+s2+s3));//얘네는 전부 string형식으로 되어서 서로 합쳐짐
			
		}
}
