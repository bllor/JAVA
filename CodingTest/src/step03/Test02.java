package step03;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		for(int a=1;a<=t;a++) {
			int i= sc.nextInt();
			int j= sc.nextInt();
			int []x= {i};
			int []y= {j};
		
			for(int b=0;b<x.length;b++) {
				int result= x[b]+y[b];
				System.out.println(result);
			}
		}
	}
}
