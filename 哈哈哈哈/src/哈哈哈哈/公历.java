package ��������;
import java.util.GregorianCalendar;
public class ���� {

	public static void main(String[] args) {
		GregorianCalendar today=new GregorianCalendar();
		System.out.println(today.get(GregorianCalendar.YEAR)+"��"+today.get(GregorianCalendar.MONTH)+"��"+today.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		GregorianCalendar day=new GregorianCalendar();
		day.setTimeInMillis(1234567898765L);
		System.out.println(day.get(GregorianCalendar.YEAR)+"��"+day.get(GregorianCalendar.MONTH)+"��"+day.get(GregorianCalendar.DAY_OF_MONTH)+"��");

	}

}
