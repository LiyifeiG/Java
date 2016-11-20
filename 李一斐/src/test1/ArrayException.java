package test1;

import java.util.Random;
import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] arr=new int[100];
		Random aRandom=new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=aRandom.nextInt(100);
		}
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a number:");
		int num=input.nextInt();
		try {
			System.out.println("The num in arr is "+num+": "+arr[num]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds!");
		}
		// TODO 自动生成的方法存根

	}

}














//public class C13_3 {
//    public static void main(String[] args){
//        int[] iArr = new int[100];
//        Random rand = new Random();
//        Scanner cin = new Scanner(System.in);
//        for (int i = 0 ; i < 100 ; i++){
//            iArr[i] = rand.nextInt();
//        }
//        System.out.print("Please input a integer index:");
//        int index = cin.nextInt();
//        try {
//            System.out.println("The number of index "+ index +" this array is "+iArr[index]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Out of bounds!");
//        }
//    }
//}
