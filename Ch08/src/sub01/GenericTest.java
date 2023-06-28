package sub01;
/*
 * 날짜: 2023/06/28
 * 이름: 최동일
 * 내용: Java 제네릭스 실습하기
 */
/*
 * 제네릭(Generic)
 * -클래스 내부의 속성 타입을 동적으로 일반화 시키는 방법
 * -제네릭 사용으로 클래스를 범용성있게 사용
 */
public class GenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("일본", 2000);
		
//		FruitBox box = new FruitBox();		
//		box.setFruit(a);//사과만 취급했기 때문에 사과만 들어올 수 있음
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		System.out.println(appleBox.getFruit());//getFruit하면 사과를 리턴 -> toString실행됨.
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		System.out.println(bananaBox.getFruit());
	}
}
