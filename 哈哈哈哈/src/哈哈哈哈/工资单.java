package ¹þ¹þ¹þ¹þ;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class ¹¤×Êµ¥
{
	public static void main(String[] arg)
	{
//		Test01 xTest01 = new Test01();
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter employee's name:");
		String name=scanner.nextLine();
		
		System.out.print("Enter number of hours worked in a week:");
		double hours=scanner.nextDouble();
		
		System.out.print("Enter hourly pay rate:");
		double pay=scanner.nextDouble();
		
		System.out.print("Enter federal tax withholding rate:");
		double federal=scanner.nextDouble();
		
		System.out.print("Enter state tax whithholding rate:");
		double state=scanner.nextDouble();
		
		System.out.println("Emploess Name:"+name);
		System.out.println("Hours Worked:"+hours);
		System.out.println("Pay Rate:"+pay);
		System.out.println("Gross Pay:"+pay*hours);
		System.out.println("Deductions:");
		System.out.println("Federal Witholding:$"+(0.2*pay*hours));
		System.out.println("State Witholding:$"+String.format("%.2f", 0.09*pay*hours));
		System.out.println("Total Deduction:$"+String.format("%.2f",0.2*pay*hours+0.09*pay*hours));
		System.out.println("Net Pay:$"+String.format("%.2f",pay*hours-0.2*pay*hours-0.09*pay*hours));
	
	}
}


class student{
	private int number;
	public student() {
		// TODO Auto-generated constructor stub
		this.number = 0;
	}
}
