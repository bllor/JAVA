package javaTest;
/*
 * 날짜: 2023/07/05
 * 이름: 최동일
 * 내용: 작업형 2번
 */
public class Test2 {

	public static void main(String[] args) {
		int x=4;
		
		for(int i=1;i<=x;i++) {
			for(int k =x;k>i;k--) {
				System.out.print("☆");
				}
			for(int j =1;j<=i*2-1;j++) {
				System.out.print("★");
			
			}
			for(int k =x;k>i;k--) {
				System.out.print("☆");
				}
			
			System.out.println();
		}
		
	}
}
