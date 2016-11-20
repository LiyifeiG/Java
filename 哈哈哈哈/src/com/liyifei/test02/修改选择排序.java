package com.liyifei.test02;


import java.util.Scanner;
public class ĞŞ¸ÄÑ¡ÔñÅÅĞò {
	
	public static void main(String[] args){
		
		int i,j;
		double k;
		double[] arr=new double[10];
		Scanner scanner=new Scanner(System.in);
		System.out.print("ÊäÈë:");
		for(i=0;i<arr.length;i++)
		{
			double a=scanner.nextDouble();
			arr[i]=a;
		}
		for(i=arr.length-1;i>=0;i--){
			for(j=i-1;j>=0;j--){
				if(arr[i]<arr[j]){
					k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"   ");
		}
	}
}
