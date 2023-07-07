package test04;

import java.util.Scanner;

/*
 * 날짜: 2023/06/30
 * 이름: 최동일
 * 내용: 예외처리 연습문제
 */
 class NotFoundException extends Exception {
	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}


 public class Test02{
	 
	 public static void main(String[] args) {
	
		 int[]arr = {2,4,6,8,10};
		 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("찾을 숫자 입력: ");
		 int find = sc.nextInt();
		 
		 
		 try {
			 searchArray(find,arr);
			 //배열에서 숫자를 찾음
			 System.out.println("해당하는 숫자 찾음!!");
			 
		 }catch(NotFoundException e) {
			 System.out.println(e.getMessage());
			// continue;
			// test1에서는 do while문이 있어서
			// 예외가 끝나고 다시 연결이 되지만
			// 여기서는 조건문이 없어서 다시 숫자입력을 받지 않아서 끝난다. 
		 }
		 finally {
			 sc.close();
		 }
		 
		 System.out.println("프로그램 정상종료...");
	}

	private static void searchArray(int find, int[] arr) throws NotFoundException {
		
		for(int i : arr) {
			if(i==find) {
				return;
			}
		}
		throw new NotFoundException();
	}
	 
 }