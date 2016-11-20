package com.liyifei.test02;
import java.util.Scanner;

public class 一元二次方程根
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a,b,c:");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		double m,r1,r2;
		m=b*b-4*a*c;
		if (m>0) 
		{
			r1=(-b+Math.sqrt(m))/2*a;
			r2=(-b-Math.sqrt(m))/2*a;
			System.out.println("The roots are "+String.format("%.6f",r1)+" and "+String.format("%.5f", r2));
		}
		if (m<0) 
		{
			System.out.println("The equation has no real roots");
		}
		if (m==0) 
		{
			System.out.println("The root is "+String.format("%.0f", -b/2*a));
		}

	}

}
