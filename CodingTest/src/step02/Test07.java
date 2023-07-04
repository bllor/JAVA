package step02;

import java.util.Scanner;

/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: test2 7번
 */
public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int []arr = {x,y,z};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1+i;j<arr.length;j++) {
				System.out.print(arr[i]+" "+arr[j]);
			}
		}
		
		
		
		
		
		
	}
}
