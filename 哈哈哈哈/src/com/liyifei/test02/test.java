package com.liyifei.test02;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class test 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("previousClosingPrice:");
		double previousClosingPrice=scanner.nextDouble();
		double currentPrice=scanner.nextDouble();
		Stock a=new Stock();
		a.getChangePercent(previousClosingPrice,currentPrice);
		System.out.println("symbol:"+a.symbol+"\nname:"+a.name );
	}
}
class Stock 
{
		String symbol;
		String name;
		double previousClosingPrice;
		double currentPrice;
		Stock() 
		{
			symbol="JAVA";
			name="Sun Microsystems Inc";// TODO �Զ����ɵĹ��캯�����
		}
		void getChangePercent(double previousClosingPrice,double currentPrice)
		{
			
			System.out.println("�ٷֱȣ�"+String.format("%.2f",(currentPrice-previousClosingPrice)*100/currentPrice)+"%");
		}
}


