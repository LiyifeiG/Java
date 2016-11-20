package com.liyifei.test02;
import java.text.DecimalFormat;
import java.util.Date;

public class test1 {
	public static void main(String[] args){
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    Account account = new Account(1122,20000);
    account.setAnnualInterestRate(0.045);
    account.withDraw(2500);
    account.deposit(3000);
    System.out.println("Balance :" + account.getBalance());
    System.out.println("MonthlyInterestRate : " + decimalFormat.format(account.getMonthlyInterestRate() * 100)  + "%");
    System.out.println("Date : " + account.getDateCreate());
}
}


class Account
{
private int id = 0;
private double balance = 0;
private double annualInterestRate = 0;
private Date dateCreate;

public Date getDateCreate() 
{
    return dateCreate;
}

public Account()
{

}
public Account(int id, double balance){
    Date date = new Date();
    this.dateCreate = Date.from(date.toInstant());
    this.id = id;
    this.balance = balance;
}

int getId() 
{
    return id;
}

void setId(int id)
{
    this.id = id;
}

double getBalance() 
{
    return balance;
}

void setBalance(double balance) 
{
    this.balance = balance;
}

double getAnnualInterestRate() 
{
    return annualInterestRate;
}

 void setAnnualInterestRate(double annualInterestRate) 
{
    this.annualInterestRate = annualInterestRate;
}

double getMonthlyInterestRate()
{
    return this.annualInterestRate / 12;
}

void withDraw(double balance)
{
    this.balance -= balance;
}

void deposit(double balance)
{
    this.balance += balance;
}

}


