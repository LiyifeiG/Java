package com.liyifei.test02;

import java.util.Scanner;
class bian{
	static double a,b,c,d,side;
	public static double jisuan(double a,double b,double c,double d){
		side=Math.sqrt(Math.abs(d-b)*Math.abs(d-b)+Math.abs(c-a)*Math.abs(c-a));
		return side;
	}
	
}
public class List {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter three points for a striangle:");
		
		double a1=scanner.nextDouble();
		double a2=scanner.nextDouble();
		double b1=scanner.nextDouble();
		double b2=scanner.nextDouble();
		double c1=scanner.nextDouble();
		double c2=scanner.nextDouble();
		double s,area,side1,side2,side3;
		
		side1=bian.jisuan(a1,a2,b1,b2);
		side2=bian.jisuan(a1,a2,c1,c2);
		side3=bian.jisuan(b1,b2,c1,c2);
		s=(side1+side2+side3)/2;
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		// TODO Auto-generated method stub
		System.out.println("The area of the triangle is "+String.format("%.1f",area));

		
	}

}
