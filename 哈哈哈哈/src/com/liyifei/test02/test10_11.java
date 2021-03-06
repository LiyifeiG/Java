package com.liyifei.test02;

import java.util.Scanner;

class Circle2D{
	private double x,y,radius;
	public Circle2D(){
		this.x=0;
		this.y=0;
		this.radius=1;
	}
	public Circle2D(double x,double y,double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	double getx(){
		return x;
	}
	double gety(){
		return y;
	}
	double getradius(){
		return radius;
	}
	double getArea(){
		double s;
		s=3.14*getradius()*getradius();
		return s;
	}
	double getPerimeter(){
		double d;
		d=2*3.14*getradius();
		return d;
	}
	String contains(double a,double b){
		double sd;
		sd=Math.sqrt(a*a+b*b);
		if(sd<1){
			return "true";
		}
		else 
			return null;
	}
	String contains(Circle2D circle){
		double s;
		s=Math.sqrt(circle.x*circle.x+circle.y*circle.y);
		if(s<Math.abs(circle.radius-1)){
			return "true";
		}
		else
			return null;
	}
	String overLaps(Circle2D circle){
		if(circle.x==0&&circle.y==0&&circle.radius==1){
			return "true";
		}
		else 
			return null;
	}
	
}

public class test10_11 {

	public static void main(String[] args) {
		Circle2D c1=new Circle2D(2,2,5.5);
		Circle2D c=new Circle2D();
		System.out.println("面积："+String.format("%.2f", c1.getArea()));
		System.out.println("周长："+String.format("%.2f", c1.getPerimeter()));
		System.out.println("点与圆的关系："+c1.contains(3,3));
		System.out.println("圆与圆的关系："+c1.contains(new Circle2D(4,5,10.5)));
		System.out.println("圆与圆师是否相等："+c1.overLaps(new Circle2D(3,5,2.3)));
		// TODO 自动生成的方法存根

	}

}
