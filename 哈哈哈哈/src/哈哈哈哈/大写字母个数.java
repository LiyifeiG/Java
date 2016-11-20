package ¹ş¹ş¹ş¹ş;

import java.util.Scanner;

public class ´óĞ´×ÖÄ¸¸öÊı {
	
	public static int da(String s){
		char[] arr=s.toCharArray();
		int m=0;
		for(int i=0;i<arr.length;i++){
			if (arr[i]>=65&&arr[i]<=90) {
				m++;
			}
		}
		return m;
		
	}

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("ÊäÈë×Ö·û´®£º");
		String str=scanner.nextLine();
		n=da(str);
		System.out.println(n);

	}

}
