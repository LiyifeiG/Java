package com.liyifei.test02;

public class test10_32
{
	
	
	public int value ;
	
	public test10_32(int value ){
		this.value=value ;

	}
	public int getValue(){
		return value;
		
	}
	
	public boolean isEven(){
		return isEven(this.value);
		
	}
	public boolean isOdd(){
		return isOdd(this.value);
	}
	public boolean isPrime(){
		return isPrime(this.value);
	}
	
	public boolean isEven(int value){
		return value%2==0;
	}
	public boolean isOdd(int value){
		return value%2!=0;
	}
	public boolean isPrime(int value){
		for(int i=2;i<value;i++){
			if(value%i==0){
				return false;
			}
		}
		return true;
	}
	
	public boolean isEven(test10_32 value){
		return value.isEven();
	}
	
	public boolean isOdd(test10_32 value){
		return value.isOdd();
	}
	
	public boolean isPrime(test10_32 value){
		return value.isPrime();
	}
	
	
	public boolean equals(int value)
	{
		return this.value==value;
	}
	
	public boolean equals(test10_32 value)
	{
		return value.equals(this.value);
		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
		test10_32 value1=new test10_32(4);
		test10_32 value2=new test10_32(5);
		
		char[] str={'1','2','3'};
		String str1="123";
	
		if(value1.isEven())
		{
			System.out.print("偶数");
		}
		if(value1.isOdd()){
			System.out.print("奇数");
		}
		
		if(value1.isPrime())
		{
			System.out.print("and素数");
		}
		else{
			System.out.println("but not 素数");
		}
		if(value2.isEven(new test10_32(9))){
			System.out.print("偶数");
		}
		if(value2.isOdd(new test10_32(9))){
			System.out.print("奇数");
		}
		if(value2.isPrime(new test10_32(9))){
			System.out.println("素数");
		}
		else{
			System.out.println("not素数");
		}
		
		System.out.println("{'1','2',3}转换为"+String.valueOf(str));
		System.out.println("'123'转换为"+Integer.parseInt(str1));
		
	}
}
