package confirm.ch05;
/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 5장 확인문제
 */
public class Test7 {

	public static void main(String[] args) {
		int[]arr = {1,5,3,8,2};
		int max =0;
		
		for(int i =0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max= arr[i];
			}
			
			
		}
		System.out.println(max);
	}
	
}
