package ¹ş¹ş¹ş¹ş;

import java.util.Scanner;
public class ×Ö·ûÅÅĞò {
	public static String sort(String s){
		char[] arr=s.toCharArray();
		int i,j;
		char a;
		for(i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		return String.valueOf(arr);
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("ÊäÈë×Ö·û´®£º");
		String str=scanner.nextLine();
		str=sort(str);
		System.out.println("ÅÅĞòºóÎª:"+str);

	}

}
