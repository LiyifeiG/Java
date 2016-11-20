package test1;

import java.util.Date;

class compareevery{
	public  Object max(Comparable[] arr) {
		Object max=arr[0];
		for(Object o:arr){
			if (((Comparable)o).compareTo(max)>=0) {
				max=o;
			}
		}
		return max;
	}
}
public class FindMix {

	public static void main(String[] args) {
		compareevery a=new compareevery();
//		Date date=new Date();
		System.out.println(a.max(new String[]{"idn","dwdw","swsw","dwinx"}));
		System.out.println(a.max(new Date[]{new Date(),new Date(33L),new Date(2339L)}));
		System.out.println(a.max(new Integer[]{1,2,3,4,5,6,7,8,9}));

	}

}
