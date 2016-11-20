package com.liyifei.test02;

import java.util.Scanner;

public class 公约数公倍数 {

	public static void main(String[] args){
		int temp,p,r;
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		if (n<m)
		   {
		    temp=n;
		    n=m;
		    m=temp;
		   }
		  p=n*m;
		while(m!=0)
		   {
		    r=n%m;
		    n=m;
		    m=r;
		   }
		System.out.println(n+" "+p/n);
		// TODO 自动生成的方法存根

	}

}
