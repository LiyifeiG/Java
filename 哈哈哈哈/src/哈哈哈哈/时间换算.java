package ��������;

import java.util.Scanner;

public class ʱ�任�� {

	public static void main(String[] args) 
	{
		int hour,minute,time2;
		Scanner scanner=new Scanner(System.in);
		int time=scanner.nextInt();
		if (time<=2359&&time>=0) 
		{
			
				hour=time/100;
				minute=time%100;
				if (hour>8) 
				{
					time2=(hour-8)*100+minute;
				}
				else 
				{
					time2=Math.abs(hour-8)*100+minute;
				}
				System.out.println(time2);
		}
	}
}
