package com.liyifei.test02;

import java.util.Scanner;

public class Yuebei {

	public static void main(String[] args) 
	{
		int i,p,max,min;
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		if(m>n)
		{
			max=m;
			min=n;
		}
		else
		{
			max=n;
			min=m;
		}
		i=min;
		while(i<=min)
		{
			if(m%i==0&&n%i==0)
			{
				System.out.print(i+" ");
				break;
			}
			else
				i=i-1;
		} 
		p=max;
		while(p>=max)
		{
			if(p%m==0 && p%n==0)
			{
				System.out.println(p);
				break;
			}
			else
				p=p+1;
		}

	}

}
