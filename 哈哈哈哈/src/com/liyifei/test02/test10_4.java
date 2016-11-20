package com.liyifei.test02;

//import java.lang.reflect.GenericArrayType;
//import java.text.Format;
import java.util.Scanner;

class MyPoint{
	private double x;
	private double y;
	double getx(){
		return x;
	}
	double gety(){
		return y;
	}
	public MyPoint(){
		this.x=0;
		this.y=0;
	}
	public MyPoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	void distance(double a,double b,double a1,double b1){
		double s;
		s=Math.sqrt((a1-a)*(a1-a)+(b1-b)*(b1-b));
		System.out.println("distance="+String.format("%.2f", s));
	}
}
public class test10_4 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("输入点的坐标a,b=");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		MyPoint m=new MyPoint();
		m.distance(m.getx(),m.gety(),a,b);
//		System.out.println("distance="+String.format("%.2f", s));
	}

}
