package confirm.ch05;

import java.util.Scanner;

/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 5장 확인문제
 */
public class Test9 {

	public static void main(String[] args) {
		int []arr = null ;
		int student = 0;
			
		
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			
			Scanner sc = new Scanner(System.in);
			
			int answer= sc.nextInt();
			if(answer==1) {
				System.out.println("선택>"+answer);
				System.out.println("학생수:");
				student=sc.nextInt();
				arr =new int[student];
			}else if(answer==2) {
				System.out.println("선택>"+answer);
				arr = new int[student];
				for(int i =0; i<arr.length;i++) {
					System.out.printf("scores[%d]>",i);
					arr[i]=sc.nextInt();
					
				}
				
				System.out.println();
			}else if(answer==3) {
				System.out.println("선택>"+answer);
				
				
				for(int i=0 ; i<arr.length;i++) {
					System.out.printf("score[%d]>%d",i,arr[i]);
					System.out.println();
				}
				
				
				
			}else if(answer==4) {
				System.out.println("선택"+answer);
				int sum =0, max=0, count =0;;
						
				for(int i =0; i<arr.length;i++) {
					
					sum+=arr[i];
					count++;
					if(max<arr[i]) {
						max=arr[i];
					}
				}
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+((double)sum/count));
					
					
			}else if(answer==5) {
				
				System.out.println("선택"+answer);
				System.out.println("프로그램 종료");
				break;
				
			}
			
		}
		
		
	}
}
