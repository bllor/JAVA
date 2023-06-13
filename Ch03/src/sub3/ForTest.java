package sub3;
/*
 * 날짜: 2023.6.13
 * 이름: 최동일
 * 내용: Java의 반복문인 for문 실습하기
 */
public class ForTest {
	public static void main(String[] args) {
		
		//for
//			for(초기값;조건식;증감식) {
//		}형태로 사용함.
//		 Ex) for(int i=1;i<=5;i++) {
//			 /내용
//		 }
//		i는 1로 시행이 됨.
//		i는 5보다 작으니까 내용이 실행됨.
//		i++로 인해 i가 1증가되어 2가됨.
//		i=2 ,i=3 등등 i=6이되면 i<=5가 거짓이므로 조건이 끝남/
	
		for(int i=1;i<=3;i++) {
			System.out.println("i: "+i);
		}
		
		
		//1부터 10까지의합
		
		int sum=0;
		for(int k=1;k<=10;k++) {
			 sum+=k;
		}
		System.out.println(sum);

		//1부터 10까지 짝수의 합
//		int sum1=0, a=0;
//		for(int n=1;n<=10;n++) {
//			if(n%2==0) {
//				sum1+=n;
//			}
//		}
//		System.out.println(sum1);
	//중간점이 여러 개일 때 다음 중간점으로 가는 방법은 resume(f8)을 누르기	
		int tot=0;
		for(int k=1;k<=10;k++) {//for문의 int k가 1부터 10까지의 합의 k와 같은데 k는 지역변수로 쓰여서 for안에서만 존재함. 그래서 여러군데서 사용이 가능하다.
			if(k%2==0) {
				tot+=k;
			}
		}
		System.out.println("1부터 10까지 짝수의 합은 "+tot);
		
		//for중첩
		for(int a=1;a<=3;a++) {
			System.out.println("a: "+a);
		for(int b=1;b<=5;b++) {
			System.out.println("b: "+b);
			for(int c=1;c<=7;c++) {
				System.out.println("c: "+c);
			}
		}
		}
		//구구단
		for(int x=2;x<=9;x++) {
			System.out.println(x+"단");
			for(int y=1;y<=9;y++) {
				int z= x*y;
				System.out.printf("%d x %d= %d\n",x,y,z);//첫 번재 %d에는 x값이, 두 번째 %d에는 y,세 번째 %d에는 z가 들어간다.
			}//printf는 형식을 정함
		}
		//별삼각형
		for(int start=10;start>=1;start--) {//start<=1 은 start가 10이므로 조건이 거짓이 된다. ->그래서 출력이 안됬음
			for(int end=start;end>=1;end--) {
				System.out.print("*");
				
			}
		System.out.print("\n");
		}
		

		
	}
}
