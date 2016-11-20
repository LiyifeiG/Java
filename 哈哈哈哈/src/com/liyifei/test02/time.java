package com.liyifei.test02;


class LinearSearch{
	int linearSearch(int[] list,int key){
		for(int i=0;i<list.length;i++){
			if(key==list[i]){
				return i;
			}
		}
		return -1;
	}
}


class BinarySearch{
	public int binarySearch(int [] list,int key){
		int low=0;
		int high=list.length-1;
		while(high>=low){
			int mid=(low+high)/2;
			if(key<list[mid]){
				high=mid-1;
			}
			else if (key==list[mid]) {
				return mid;
			}
			else {
				low=mid+1;
			}
		}
		return -low-1;
	}
}

public class time {
	
	public static void main(String[] args) {
		int[] arr=new int[100000];
		for (int i=0;i<arr.length;i++)  
		{
			arr[i]=(int)(1+Math.random()*(1000-1+1));
		}
		int k;
		k=(int)(1+Math.random()*(1000-1+1));
		LinearSearch a=new LinearSearch();
		BinarySearch b=new BinarySearch();
		long starttime= System.nanoTime();       
		a.linearSearch(arr, k);
		long endtime=System.nanoTime();  
		long executiontime=endtime-starttime;
		System.out.println("顺序查找时间："+executiontime);
		long starttime1=System.nanoTime();    
		b.binarySearch(arr, k);
		long endtime1=System.nanoTime();     
		long executiontime1=endtime1-starttime1;
		System.out.println("二分查找时间："+executiontime1);
	}
}