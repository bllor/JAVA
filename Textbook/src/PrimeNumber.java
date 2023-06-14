
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("소수: ");
		
		for(int i=2; i<=1000000; i++) {
			boolean a= true;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					a=false;
					break;//i%j==0일경우 if문을 나옴
				}
			}
			if(a) {
				System.out.print(i+" ");
			}
		}
	}
}
/*
 * for문이 시작되면 a=true인 상태
 * i=2는 for(j)가 있는 조건에 맞지 않으므로 if로 넘어감
 * if(a=true)이므로 i가 출력됨.
 * i=4일 때 if(i%j==0)의 조건에 만족
 * if조건에서 a=false; a=false일 경우 출력이 안됨.
 * i=9 -> for(int j=2; j<i;j++)에서 j=2일 때 if(i%j==0)의 조건에 맞지 않으므로 j=3이 됨
 * j=3이 되면 if(i%j==0) -> a= false가 됨
*/
