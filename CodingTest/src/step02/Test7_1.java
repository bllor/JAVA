package step02;

import java.util.Scanner;

public class Test7_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
	
		if(x==y&&x==z) {
			System.out.print(10000+x*1000);
		}else if(x==y&&x!=z||x!=y&&x==z) {
				System.out.print(1000+x*100);
		}else if(x!=y&&y==z) {
				System.out.print(1000+y*100);
		}else {
			int max =x;
			if(max<y) {
				max=y;
				if(max<z) {
					max=z;
				}
			}
			System.out.print(max*100);
		}
		
		sc.close();
		
	}
}

