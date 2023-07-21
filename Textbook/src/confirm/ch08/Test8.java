package confirm.ch08;
/*
 * 날짜: 2023/07/21
 * 이름: 최동일
 * 내용: 8장 연습문제
 */

 interface A{
	public void method1();
}
 
 class B implements A{

	@Override
	public void method1() {
		System.out.println("B-Method1()");
		
	}
	 
 }
 
 class C implements A{

		
		public void method2() {
			System.out.println("C-Method2()");
			
		}

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			System.out.println("C-Method1()");
		}
		 
	 }
public class Test8 {

	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		};
	}
	
	public static void main(String[] args) {
		
		action(new B());
		action(new C());
	}
}
