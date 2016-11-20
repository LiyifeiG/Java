

package ¹þ¹þ¹þ¹þ;
import javax.swing.*;


public class ¹¤×Êµ¥2 {

	public static void main(String[] args)
	{
	String a =	JOptionPane.showInputDialog(null,"Enter employee's name:");
	float b =	Float.parseFloat(JOptionPane.showInputDialog("Enter number of hours worked in a week:"));
	float c =	Float.parseFloat(JOptionPane.showInputDialog("Enter hourly pay rate:"));
	float d =	Float.parseFloat(JOptionPane.showInputDialog("Enter federal tax withholding rate:"));
	float e =	Float.parseFloat(JOptionPane.showInputDialog("Enter state tax whithholding"));
	

	JOptionPane.showMessageDialog(null,"Emploee Name:"+a+"\n"+
							"Hours worked:"+b+"\n"+
							"Pay Rate:$"+c+"\n"+
							"Cross Pay:$"+b*c+"\n"+
							"Deduction:\n"+
							"	Federal Withholding:$"+b*c*0.2+"\n"+
							"	State Withholding:$"+b*c*0.09+"\n"+
							"	Total Deduction:$"+(b*c*0.2+b*c*0.09)+"\n"+
							"Net Pay:$"+((b*c)-(b*c*0.2+b*c*0.09)));
	
	}
}
