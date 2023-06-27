package sub02;

/*
 * 날짜: 2023/06/27
 * 이름: 최동일
 * 내용: Java StringBuilder 클래스 실습하기
 */
//스트링에 내부저장소인 빌더를 생성하여 저장공간을 많이 차지하는 것을 막음
public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str = "Java";
		System.out.println("str 객체 주소 값"+System.identityHashCode(str));
		
		str +="Programming";
		System.out.println("str 객체 주소 값"+System.identityHashCode(str));
		//programming을 추가 했을 대 str의 주소 값이 달라진다.
/*
 * str가 java를 heap에 생성함 (주소:1023487453;)
 * str에 programming을 하면 새롭게 heap에 생성함 주소(1651191114;)
 * str을 변경하게 되면 주소가 달라짐 이전에 저장되었던 주소는 사라지지 않고 계속 남아있어서 저장공간을 차지함(String의 immutable한 특성때문)
 * 기존에 사용했던 주소에 저장을 하기 위해서 StringBuilder를 사용함.
 */
		
		
		
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체 주소 값"+System.identityHashCode(sb));
		
		sb.append("programming");
		System.out.println("sb 객체 주소 값"+System.identityHashCode(sb));
/*
 * sb의 주소값:1586600255
 * sb에 programming을 추가하였는데도 주소값은 1586600255로 동일하게 나온다.		
 */
		
	}
}
