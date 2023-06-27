package sub05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜: 2023/06/27
 * 이름: 최동일
 * 내용: Java Date 클래스 실습하기
 */
public class DateTest {

	public static void main(String[] args) {
		
		//Date 클래스 
		//Date는 단독으로 잘 사용되지 않고, SimpleDateFormat과 같이 쓰임
		Date date = new Date();//Date를 util로 되어있는 것을 선택
		System.out.println("now : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result: "+result);
		
		
		//Calendar 클래스
//		Calendar car = new Calender();는 싱글톤이라서 안됨.
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//1월이 0으로 출력되기 때문에 뒤에 +1을 해줘야함
		int d = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);//그냥 hour만하면 1~12만 나타내므로 12시면 0으로 뜬다.
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		
		System.out.printf("%d-%d-%d %d:%d:%d",year,month,d,hour,min,sec);
	}
}
