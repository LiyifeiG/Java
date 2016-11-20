package com.liyifei.test02;

import java.util.Scanner;

class bi{
	boolean equal(int[] list1,int[] list2){
	int i;
	int tag;
	tag=1;
	for(i=0;i<list1.length;i++){
		if(list1[i]!=list2[i]){
			tag=0;
			break;
		}
	}
	if(tag==0){
		return false;
	}
	else {
		return true;
	}
	}
}
public class 比较数组{
	public static void main(String[] args)
	{
		int i,j,p;
		Scanner scanner=new Scanner(System.in);
		bi a=new bi();
		System.out.print("输入数组大小；");
		int n=scanner.nextInt();
		int[] list1=new int[n];
		int[] list2=new int[n];
		System.out.print("输入数组list1；");
		for(i=0;i<list1.length;i++){
			list1[i]=scanner.nextInt();
		}
		for(i=0;i<list1.length;i++){
			for(j=i+1;j<list1.length;j++){
				if(list1[i]>list1[j]){
					p=list1[i];
					list1[i]=list1[j];
					list1[j]=p;
				}
			}
		}
		System.out.print("输入数组list2；");
		for(i=0;i<list2.length;i++){
			list2[i]=scanner.nextInt();
		}
		for(i=0;i<list2.length;i++){
			for(j=i+1;j<list2.length;j++){
				if(list2[i]>list2[j]){
					p=list2[i];
					list2[i]=list2[j];
					list2[j]=p;
				}
			}
		}
		if(a.equal(list1,list2)){
			System.out.println("Two lists are identical");
		}
		else{
			System.out.println("Two lists are not identica");
		}

	}

}

