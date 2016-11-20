package com.liyifei.test02;

import java.util.Scanner;

class MyInteger
{
	private int value=1;
	public MyInteger(int p) 
	{
		this.value=p;// TODO 自动生成的构造函数存根
	}
	int getvalue(){
		return value;
	}
	public MyInteger(){
		
	}
	int sushu(int value){
		int i;
		int tag=1;
		for(i=2;i<value;i++){
			if (value%i==0) {
				tag=0;
				break;
			}
		}
		return tag;
	}
	String isEven(){
		if (value%2==0) {
			return "true";
		}
		else
			return null;
	}
	
	String isOdd(){
		if (value%2==0) {
			return "true";
		}
		else
			return null;
	}
	
	String isprime(){
		if (sushu(value)==1) {
			return "true";
		}
		else
			return null;
	}
	
	String isEven(int value){
		if (value%2==0) {
			return "true";
		}
		else
			return null;
	}
	
	String isOdd(int value){
		if (value%2==0) {
			return "true";
		}
		else
			return null;
	}
	
	String isprime(int value){
		if (sushu(value)==1) {
			return "true";
		}
		else
			return null;
	}
//	int parseInt(String s){
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("请输入字符串：");
//		String  s=scanner.nextLine();
//		return int(s);
//	}
//	int parseInt(char s[]){
//		
//	}
}




public class test10_3 
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入value的值：");
		int v=scanner.nextInt();
		MyInteger a=new MyInteger();
		if (a.isEven()=="true"||a.isOdd()=="true"||a.isprime()=="true")
		{
			System.out.println("true");
		}
		MyInteger b=new MyInteger(v);
		if (b.isEven(v)=="true"||b.isOdd(v)=="true"||b.isprime(v)=="true")
		{
			System.out.println("true");
		}// TODO 自动生成的方法存根

	}

}
