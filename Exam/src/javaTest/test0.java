package javaTest;

public class test0 {

	public static void main(String[] args) {
		int result =0;
		
		for(int k =1; k<=10;k++) {
			if(k%2==1) {
				result+=k;
			}
		}
		
		System.out.println(result);
	}

}
