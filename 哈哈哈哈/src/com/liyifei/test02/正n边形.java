package com.liyifei.test02;

class Regularpolgon
{
	private int n;
	private double size;
	private double x;
	private double y;
	public Regularpolgon() 
	{
		n=3;
		size=1;
		x=0;
		y=0;// TODO 自动生成的构造函数存根
	}
	public Regularpolgon(int n,double size)
	{
		x=0;
		y=0;
		this.n=n;
		this.size=size;
	}
	public Regularpolgon(int n,double size,double x,double y)
	{
		this.n=n;
		this.size=size;
		this.x=x;
		this.y=y;
	}
	
	
	int getn(){
		return n;
	}
	double getside(){
		return size;
	}
	double getx(){
		return x;
	}
	double gety(){
		return y;
	}
	double getPerimeter()
	{
		double d;
		d=getn()*getside();
		return d;
	}
	double getArea()
	{
		double s;
		double pi=3.14;
		s=(getn()*getside()*getside())/(4*Math.tan(pi/getn()));
		return s;
	}
	
}
public class 正n边形 {

	public static void main(String[] args) 
	{
		Regularpolgon a=new Regularpolgon();
		Regularpolgon b=new Regularpolgon(6,4);
		Regularpolgon c=new Regularpolgon(10,4,5.6,7.8);
		double ad,bd,cd,as,bs,cs;
		ad=a.getPerimeter();
		bd=b.getPerimeter();
		cd=c.getPerimeter();
		as=a.getArea();
		bs=b.getArea();
		cs=c.getArea();
		System.out.println("a周长:"+String.format("%.2f", ad)+"		a面积:"+String.format("%.2f", as)+
		"\nb周长:"+String.format("%.2f",bd)+"			b面积:"+String.format("%.2f", bs)+
		"\nc周长:"+String.format("%.2f",cd)+"			c面积:"+String.format("%.2f", cs));
		// TODO 自动生成的方法存根

	}

}
