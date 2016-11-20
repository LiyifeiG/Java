package test1;

import java.util.Scanner;

class Pre{
	String str1,str2;
	String prefix(String s1,String s2)
	{
		int i;
		char[] char1=s1.toCharArray();
		char[] char2=s2.toCharArray();
		char[] pre=new char[10];
		
		for(i=0;i<char1.length;i++)
		{
			if (char1[i]!=char2[i]) 
			{
				break;
			}
				if (char1[i]==char2[i]) 
				{
					pre[i]=char1[i];
				}
				
			
		}
		String str3=new String(pre);
		if (pre.length==0) {
			return "";
		}
		else 
		return  str3;
}
}

public class Headstring {

	public static void main(String[] args) 
	{
		String s;
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		Pre a=new Pre();
		s=a.prefix(str1,str2);
		System.out.println(s);

	}

}
