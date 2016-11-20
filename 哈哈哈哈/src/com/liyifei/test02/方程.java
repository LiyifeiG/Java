package com.liyifei.test02;

import java.util.Scanner;


class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	public QuadraticEquation(double a,double b,double c) 
	{
		this.a=a;
		this.b=b;
		this.c=c;	// TODO 自动生成的构造函数存根
	}
	
	
	double geta()
	{
		return a;
	}
	double getb()
	{
		return b;
	}
	double getc()
	{
		return c;
	}
	
	
	double getDiscriminant()
	{
		double m;
		m=b*b-4*a*c;
		return m;
	}
	double getRoot1()
	{
		double  r1;
		r1=((-b+Math.sqrt(getDiscriminant()))/2*a);
		return r1;
	}
	double getRoot2()
	{
		double  r2;
		r2=((-b-Math.sqrt(getDiscriminant()))/2*a);
		return r2;
	}
}


public class 方程 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入a，b，c的值：");
		double aput=scanner.nextDouble();
		double bput=scanner.nextDouble();
		double cput=scanner.nextDouble();
		QuadraticEquation m=new QuadraticEquation(aput,bput,cput);
		if (m.getDiscriminant()>0) 
		{
			System.out.print("r1="+String.format("%.2f",m.getRoot1())+"	r2="+String.format("%.2f",m.getRoot2()));
		}
		if (m.getDiscriminant()==0) 
		{
			System.out.print("r="+String.format("%.2f",m.getRoot1()));
		}
		if (m.getDiscriminant()<0) 
		{
			System.out.println("The question is no roots.");
		}
		// TODO 自动生成的方法存根

	}

}
