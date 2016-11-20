package 哈哈哈哈;
import java.util.GregorianCalendar;
public class 公历 {

	public static void main(String[] args) {
		GregorianCalendar today=new GregorianCalendar();
		System.out.println(today.get(GregorianCalendar.YEAR)+"年"+today.get(GregorianCalendar.MONTH)+"月"+today.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		GregorianCalendar day=new GregorianCalendar();
		day.setTimeInMillis(1234567898765L);
		System.out.println(day.get(GregorianCalendar.YEAR)+"年"+day.get(GregorianCalendar.MONTH)+"月"+day.get(GregorianCalendar.DAY_OF_MONTH)+"日");

	}

}
