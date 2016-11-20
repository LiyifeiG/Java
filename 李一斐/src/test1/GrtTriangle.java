package test1;

import java.util.Scanner;

class GeometricObject{
	String color;
	boolean filled;
	public GeometricObject() {
		
	}
	public GeometricObject(String color1,boolean filled1){
		color=color1;
		filled=filled1;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color1) {
		this.color = color1;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled1){
		this.filled=filled1;
	}
	public String toString(){
		return ("color="+color+"  filled="+filled);
	}
	public static double sumArea(GeometricObject[] gto){
		double sum=0.0;
		for(GeometricObject it:gto){
			if (it instanceof Rectangle) 
			{
				sum=sum+((Rectangle)it).getArea();
			}
			if (it instanceof Circle)
			{
				sum=sum+((Circle)it).getArea();
			}
				
		}
		return sum;
	}
}
class Triangle extends GeometricObject{
	double size1;
	double size2;
	double size3;
	public Triangle(){
		
	}
	public Triangle(double sizea,double sizeb,double sizec){
		size1=sizea;
		size2=sizeb;
		size3=sizec;
	}
	public Triangle(double sizea,double sizeb,double sizec,String color1,boolean filled1)
	{
		size1=sizea;
		size2=sizeb;
		size3=sizec;
		color=color1;
		filled=filled1;
		
	}
	public double getSize1() {
		return size1;
	}
	public void setSize1(double size1) {
		this.size1 = size1;
	}
	public double getSize2() {
		return size2;
	}
	public void setSize2(double size2) {
		this.size2 = size2;
	}
	public double getSize3() {
		return size3;
	}
	public void setSize3(double size3) {
		this.size3 = size3;
	}
	public double getArea(){
		double p=(size1+size2+size3)/2;
		double Area=Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
		return Area;
	}
	public double getPerimeter(){
		return size1+size2+size3;
	}
	public String toString(){
		return super.toString()+"\nPerimeter="+getPerimeter()+"  Area="+getArea();
	}
	
	
}
public class GrtTriangle {

	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		String color=scanner.nextLine();
		boolean filled=scanner.nextBoolean();
		double size1=scanner.nextDouble();
		double size2=scanner.nextDouble();
		double size3=scanner.nextDouble();
		Triangle triangle=new Triangle(size1,size2,size3,color,filled);
		System.out.println(" Ù–‘£∫\n"+triangle.toString());
	}

}
