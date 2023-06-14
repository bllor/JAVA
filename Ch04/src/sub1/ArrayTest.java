package sub1;
/*
 *  날짜:2023/6/14
 *  이름:최동일
 *  내용:Java 배열 실습하기
 *  
 *  
 *  배열: 같은 타입의 데이터로 이루어진 가장 기본적인 자료구조
 *  	배열을 구성하는 데이터를 원소라고 하며, 각 원소의 번호를 인덱스라고 한다.
 *  	인덱스는 0부터 시작한다.
 *  배열은 foreach문으로 반복처리한다.
 *  현대 컴퓨터 사회에서는 배열보다 리스트를 더 많이 사용한다.
 *  배열의 이름을 정할 때는 복수형으로 작성해야하는 규칙이 존재한다.
 */

public class ArrayTest {
	public static void main(String[] args) {
		
//		배열
		int[] arr1= {1,2,3,4,5};
		char[] arr2= {'a','b','c'};
		String[] arr3= {"서울","대구","대전","부산"};
		//[]은 배열을 나타내는 키워드
		//{}을 하게 된다면 데이터를 여러가지 넣을 수 있다
		//배열은 같은 타입의 데이터만 묶을 수 있다.
		//데이터의 타입에 맞게 []앞에 자료형을 나타내준다.
		
//		원소 출력
		System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("arr1[2] : "+arr1[2]);
		System.out.println("arr1[4] : "+arr1[4]);
		
		System.out.println("arr2[1] : "+arr2[1]);
		
		System.out.println("arr3[3] : "+arr3[3]);
		//arr1[0]은 배열 arr1의 인덱스번호0의 값인 1을 출력한다.
		
//		배열길이
//		원소의 개수를 배열의 길이라고 한다.
		System.out.println("arr1 길이: "+arr1.length);
		System.out.println("arr2 길이: "+arr2.length);
		System.out.println("arr3 길이: "+arr3.length);
		
//		배열 반복문
//		배열하고 for문은 같이 잘 쓰인다.
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		//배열전용반복문-해당배열과 자료형이 맞아야 출력이 가능하다
		for(char c : arr2) { //arr2의 길이 만큼 반복되며, arr의 자료가 c에 들어감.
			System.out.println(c+" ");
		}
		
		for(String a : arr3) {
			System.out.println(a+"");
		}
//		1차원 배열-한 줄로 구성되어있는 배열
//		위의  arr1/arr2/arr3모두 1차원 배열
		int[]scores = {80,60,78,62,92};
		int total= 0;
//		for(int i=0;i<scores.length;i++) {
//			total+=scores[i];
//		}
		for(int c: scores) {//scores배열의 0번째 인덱스가 c가 되며, scores의 길이만큼 반복된다.
			total+=c; //total=total+c(=scores[0])
		}
		
		System.out.println("scores 합: "+ total);
//		2차원 배열 [][]으로 만든다.
		int[][] arr2d= {{1,2,3,4,},{5,6,7,8},{9,10,11,12}};//만들 때 구조 먼저 잡고 만드는게 낫다.
//		int[][] arr2d= {{1,2,3,4,},
//						{5,6,7,8},
//						{9,10,11,12}}; 이런식으로 저장이 된다.
//		숫자 1의 인덱스번호는 00, 3은 02, 6은 11, 8은 13 세로 먼저 읽는다.
		for(int a=0;a<3;a++) {
			for(int b=0;b<4;b++) {
				System.out.println("arr2d["+a+"]["+b+"] :"+arr2d[a][b]);
			}
		}
//		3차원 배열
//		[][][]로 표현한다.
		
		int[][][] arr3d= {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};
//		int[][][] arr3d= {{{1,  2,  3},
//						   {4,  5,  6},
//						   {7,  8,  9}},인덱스 0
//						  {{10, 11, 12},
//						   {13, 14, 15},
//						   {16, 17, 18}},인덱스 1
//						  {{19, 20, 21},
//						   {22, 23, 24},
//						   {25, 26, 27}}};인덱스 2
//							과 같은 형태로 저장이 되어있다
//숫자 1은 000, 숫자 6은 012 숫자 17은 122, 25는220이 된다.		
		for(int a=0;a<3;a++) {
			for(int b=0;b<3;b++) {
				for(int c=0;c<3;c++) {
					System.out.println("arr3d["+a+"]["+b+"]["+c+"] :"+arr3d[a][b][c]);
				}
			}
		}
		
		
	}
}
