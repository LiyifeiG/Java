package test1;

import java.util.Scanner;

class Circle_ extends GeometricObject implements Comparable{
	double radius;
	public Circle_(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return (3.14*radius*radius);
	}
	public int compareTo(Object c){
		if (getArea()>=((Circle_) c).getArea()) {
			return 1;
			
		}
		else
			return -1;
	}
	public boolean equals(Object o){
		if (this.radius==((Circle_) o).radius) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class CompareCircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		Circle_ circle1=new Circle_(a);
		Circle_ circle2=new Circle_(b);
		System.out.println(circle1.equals(circle2));
		// TODO 自动生成的方法存根

	}

}
