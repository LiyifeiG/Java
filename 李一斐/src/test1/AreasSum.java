package test1;

class Rectangle extends GeometricObject{
	double longs;
	double wides;
	public Rectangle(){
		
	}
	public Rectangle(double longs,double wides){
		this.longs=longs;
		this.wides=wides;
	}
	public double getArea(){
		return longs*wides;
	}
}

public class AreasSum {

	public static void main(String[] args) {
		GeometricObject[]  arr={new Circle(5),new Circle(2),new Rectangle(3,4),new Rectangle(2,3)};
		// TODO 自动生成的方法存根
		System.out.println(GeometricObject.sumArea(arr));

	}

}
