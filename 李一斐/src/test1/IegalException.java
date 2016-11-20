package test1;

import java.util.Date;
import java.util.Scanner;

class Loan{
	double annualInterestRate;
	int numberOfYears;
	double loanAmount;
	Date loanDate=new Date();
	public Loan(){
		this.annualInterestRate=2.5;
		this.numberOfYears=1;
		this.loanAmount=1000;
	}
	public Loan(double a,int b,double c){
		if (a <= 0 || b<= 0 || c <= 0){
          throw new IllegalArgumentException();
      }
		this.annualInterestRate=a;
		this.numberOfYears=b;
		this.loanAmount=c;
		loanDate=new Date();
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double a){
		this.annualInterestRate=a;
	}
	public int getNumberOfYears(){
		return numberOfYears;
	}
	public void setNumberOfYears(int b){
		this.numberOfYears=b;
	}
	public double getLoanAmount(){
		return loanAmount;
	}
	public void setLoanAmount(double c){
		this.loanAmount=c;
	}
	public double getMonthlyPayment(){
		double mothlyInterestRate=annualInterestRate/1200;
		double mothlypayment=loanAmount*mothlyInterestRate/
				(1-(1/Math.pow(1+mothlyInterestRate, numberOfYears*12)));
		return mothlypayment;
	}
	public double getTotalPayment(){
      return getMonthlyPayment() * numberOfYears * 12;
  }
}

public class IegalException {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please input annualInterestRate:");
		double a=scanner.nextDouble();
		System.out.println("Please input numberOfYears:");
		int b=scanner.nextInt();
		System.out.println("Please input loanAmount:");
		double c=scanner.nextDouble();
		try{
		Loan loan=new Loan(a,b,c);
		System.out.println("MonthlyPayment:"+loan.getMonthlyPayment());
		System.out.println("TotalPayment"+loan.getTotalPayment());
		}catch ( IllegalArgumentException ex) {
			System.out.println("error!!!!");
			// TODO: handle exception
		}
		// TODO 自动生成的方法存根
	}
}
