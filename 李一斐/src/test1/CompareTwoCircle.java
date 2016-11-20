package test1;

import java.util.Scanner;

class Circle extends GeometricObject{
	double radius;
	public Circle(){
		
	}
	public Circle(double radius) {
		this.radius=radius;
		// TODO 自动生成的构造函数存根
	}
	public double getradius(){
		return radius;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
}
@SuppressWarnings("rawtypes")
class ComparableCircle extends Circle implements Comparable{
	public ComparableCircle(double radius)
	{
		super(radius);
	}
	public double getArea(){
		return(3.14*getradius()*getradius());
	}
	public int compareTo(Object c){
		if (this.getArea()>=((ComparableCircle) c).getArea()) {
			return 1;
			
		}
		else
			return -1;
	}
	
}

public class CompareTwoCircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		ComparableCircle circle1=new ComparableCircle(a);
		ComparableCircle circle2=new ComparableCircle(b);
		if (circle1.compareTo(circle2)==1) {
			System.out.println("circle1");
			
		}
		else
		System.out.println("circle2");
		// TODO 自动生成的方法存根

	}

}
