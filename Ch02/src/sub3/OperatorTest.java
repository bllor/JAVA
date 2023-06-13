package sub3;

/*
 * 날짜: 2023년 6월 13일
 * 이름: 최동일
 * 내용: Java 연산자 실습하기
 * 
 * 연산자(Operator)
 * -변수의 데이터를 처리하기 위한 연산식
 * -일반적으로 산술, 복합대입, 비교, 논리연산을 수행
 * 
 * 교재로는 3장까지 나감
 */
public class OperatorTest {
	
	public static void main(String[] args) {
		
//		커서가 위치하고 있는 행을 복사하려면 ctrl+alt+화살표
//		커서가 위치하고 있는 행을 삭제하려면 ctrl+d
		

		//		산술연산자
		int num1=1;
		int num2=2;
		int num3=3;
		int num4=4;

		
		int result1= num1+num2;
		int result2= num1-num2;
		int result3= num2*num3;
		int result4= num4/num2;
		int result5= num4%num3;//나머지를 나타내는 연산자 4/3의 나머지인 1을 나타낸다. 4%5이면 나누는 수가 더 큰데, 이경우에는 4가 그대로 나온다.
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		System.out.println("result4: "+result4);
		System.out.println("result5: "+result5);

		//		증감연산자
		int num=0;//int num으로 선언. num=0으로 초기화
				  //int num처럼 선언만 할 수 있는데, 초기화를 같이 해주는 것이 좋음
		num++;
		++num;
		
		System.out.println("num: "+num);
		
		num--;
		--num;
		System.out.println("num: "+num);
		
		//		복합대입연산자 복합연산자로 적으면 CPU관점에서 한 번 일하는 것이므로 효율적이다.
		int n1=1, n2=2, n3=3, n4=4;
		
		n1+=1;//n1=n1+1과 같다.
		n2-=2;
		n3*=3;
		n4=n4/4;

		System.out.println("n1= "+n1);
		System.out.println("n2= "+n2);
		System.out.println("n3= "+n3);
		System.out.println("n4= "+n4);
		
		
		//		비교연산자
		
		int var1= 1;
		int var2= 2;
		
		boolean rs1= var1>var2;
		boolean rs2= var1<var2;
		boolean rs3= var1<=var2;
		boolean rs4= var1>=var2;
		boolean rs5= var1==var2;
		boolean rs6= var1!=var2;
		System.out.println("rs1 "+rs1);//var1은 var2보다 크다/
		System.out.println("rs2 "+rs2);//var1은 var2보다 작다.
		System.out.println("rs3 "+rs3);//var1은 var2보타 크거나 같다.
		System.out.println("rs4 "+rs4);//var1은 var2보다 작거나 같다.
		System.out.println("rs5 "+rs5);//var1은 var2와 서로 같다.
		System.out.println("rs6 "+rs6);//var1은 var2와 서로 다르다.
		
		
		//		논리연산자
//		or키는 shift+\
		int var3=3;
		int var4=4;
		
		boolean res1=(var3>3)&& (var4>3);//var3는 3보다 크고 var4는 3보다 작다.
		boolean res2=(var3>2)&& (var4>3);//var3는 2보다 크고 var4는 3보다 작다.
		boolean res3=(var3>3)|| (var4>3);//var3는 3보다 또는 var4는 3보다 작다. 
		boolean res4=(var3>3)|| (var4>5);//var3는 3보다 크고 var4는 5보다 크다. 
		boolean res5= !(var3>var4); //var3는 var4보다 크지 않다.
		
		System.out.println("res1: "+res1);
		System.out.println("res2: "+res2);
		System.out.println("res3: "+res3);
		System.out.println("res4: "+res4);
		System.out.println("res5: "+res5);
	}


}
