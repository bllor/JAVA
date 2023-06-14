package sub4;
/*
 * 날짜:2023/6/14
 * 이름:최동일
 * 내용:JAVA의 반복문인 While 실습하기
 */
public class WhileTest {
	public static void main(String[] args) {
//		while(조건식이 들어감-조건이 참일 경우 계속 수행됨.) {
//			
//		}
		
//		1부터 10까지 합
		int sum=0;
		int k=1;
		
		while(k<=10) {
			sum+=k;
			k++;
		}
		System.out.println("1부터 10까지의 합 : "+sum);

		//		do-while
		//while문의 본문내용이 while의 위로 올라감
		//일단 {}의 내용이 한 번 실행되고 while이 참이면 다시 실행된다.
		int tot=0, i=1;
		do {
			if(i%2==0) {
			tot += i;}
			i++;
		}while(i<=10);
		
		System.out.println("1부터 10까지 짝수합 : "+tot);
//		break
		int num=1;
		
		while(true) {//while문이 true이면 무한으로 돌리겠다는 뜻인데 무한으로 돌아가진 않는다.
					//특정조건에서 무한 루프를 멈추게 하는 장치가 있는데 그 장치가 break;이다.
			if(num%5==0 && num%7 ==0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : "+num );
//		continue는 반복문의 상위로 올린다.
//		밑의 continue는 j%2==1일 때 total까지 내려가지 않고 j++를 실행할 수 있게 만든다.
		int total=0;
		int j=0;
		
		while(j<=10) {
			
			j++;
			if(j%2==1) {
				continue; // 반복문의 처음으로 이동
			}
			total+=j;
		}
		System.out.println("total: "+total);
	}
}
