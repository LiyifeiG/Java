package test1;

import java.math.BigDecimal;

public class ½üËÆe {

	public static void main(String[] args) 
	{
		int n;
		double i,sum=1,t;
		double s=1;
		for(n=100;n<=1000;n=n+100)
		{
			for(i=1;i<=n;i++)
			{
				s=s*i;
				t=1/s;
				sum=sum+t;
			}
			BigDecimal e=new BigDecimal(sum);
			System.out.println(e);
		}

	}

}
