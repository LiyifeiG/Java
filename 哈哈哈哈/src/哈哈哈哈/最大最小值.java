package 哈哈哈哈;

import javax.print.attribute.standard.PrinterLocation;

public class 最大最小值
{
	public static void main(String args[])
	{
		int i,min,max;
		int a[]={78,12,34,54,98};
		min=max=a[0];
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println();
		System.out.println("min="+min);
		System.out.println("max="+max);
	}
}
