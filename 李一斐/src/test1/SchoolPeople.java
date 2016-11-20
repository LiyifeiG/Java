package test1;

import java.util.Scanner;

class People{
	String name;
	String address;
	String phone;
	String emil;
	public People(){
		
	}
	public People(String name,String address,String phone,String emil){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.emil=emil;
	}
	public String toString(){
		return ("name:"+name+"  address:"+address+"  phone:"+phone+"  emil:"+emil+"\n");
	}
}


class Student extends People{
	String grade;

	public void people(){
		
	}
	public Student(String name,String address,String phone,String emil,String grade) 
	{
//		this.name=name;
//		this.address=address;
//		this.phone=phone;
//		this.emil=emil;
		super(name,address,phone,emil);
		this.grade=grade;
	}
	public String toString(){
		return (super.toString()+"   grade:"+grade+"\n");
	}
	
}

class MyDate{
	int year;
	int month;
	int day;
	public MyDate(){
		
	}
	public  void inputtime() 
	{
		Scanner input=new Scanner(System.in);
		year=input.nextInt();
		month=input.nextInt();
		day=input.nextInt();
	}
}

class Employee extends People{
	int office;
	int salary;
	String workday;
	public Employee(){
		
	}
	public Employee(String name, String address, String phone, String emil,int office,int salary,String workday) 
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.emil=emil;
		this.office=office;
		this.salary=salary;
		this.workday=workday;
		// TODO 自动生成的构造函数存根
	}
	public String toString(){
		return (super.toString()+"  office:"+office+"  "+"  salary:"+salary+"  workday:"+workday+"\n");
	}
}


class Faculty extends Employee{
	int worktime;
	int rank;
	public Faculty(String name, String address, String phone, String emil,int office,int salary,String workday,int worktime,int rank){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.emil=emil;
		this.office=office;
		this.salary=salary;
		this.workday=workday;
		this.worktime=worktime;
		this.rank=rank;
	}
	public String toString(){
		return (super.toString()+"  worktime:"+worktime+"  rank:"+rank+"\n");
	}
	
}


class Staff extends Employee{
	String titlename;
	public Staff(String name, String address, String phone, String emil,int office,int salary,String workday,String titlename){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.emil=emil;
		this.office=office;
		this.salary=salary;
		this.workday=workday;
		this.titlename=titlename;
	}
	public String toString(){
		return (super.toString()+"  titlename:"+titlename);
	}
	
}
public class SchoolPeople {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//People类时
		System.out.println("Please input people name,address,phone,emil:\n");
		String name=scanner.nextLine();
		String address=scanner.nextLine();
		String phone=scanner.nextLine();
		String emil=scanner.nextLine();
		People people=new People(name,address,phone,emil);
		System.out.println("people:\n"+people.toString());
		//student类
		System.out.println("Please input student name,address,phone,emil:\n");
		String name1=scanner.nextLine();
		String address1=scanner.nextLine();
		String phone1=scanner.nextLine();
		String emil1=scanner.nextLine();
//		String grade1=scanner.nextLine();
		Student student=new Student(name1,address1,phone1,emil1,"大二");
		System.out.println("student:\n"+student.toString());
		//Employee类
		System.out.println("Please input Employee name,address,phone,emil,office,salary:\n");
		String name2=scanner.nextLine();
		String address2=scanner.nextLine();
		String phone2=scanner.nextLine();
		String emil2=scanner.nextLine();
		int office2=scanner.nextInt();
		int salary2=scanner.nextInt();
		//mydate类
			System.out.println("Please input employee workday:\n");
			MyDate mydate=new MyDate();
			mydate.inputtime();
			String str=(mydate.year+"."+mydate.month+"."+mydate.day);
		
		
		Employee employee=new Employee(name2,address2,phone2,emil2,office2,salary2,str);
		System.out.println("Employee:\n"+employee.toString());
		//Faculty
		System.out.println("Please input Employee name,address,phone,emil,office,salary,workday,worktime,rank:\n");
		String name3=scanner.nextLine();
		String address3=scanner.nextLine();
		String phone3=scanner.nextLine();
		String emil3=scanner.nextLine();
		int office3=scanner.nextInt();
		int salary3=scanner.nextInt();
			//mydate类
			System.out.println("Please input Faculty workday:\n");
			mydate.inputtime();
			String str1=(mydate.year+"."+mydate.month+"."+mydate.day);
		
		int worktime3=scanner.nextInt();
		int rank3=scanner.nextInt();
		
		Faculty faculty=new Faculty(name3, address3, phone3, emil2, office3, salary3, str1, worktime3, rank3);
		System.out.println("Faculty:"+faculty.toString());
//		Staff
		System.out.println("Please input Employee name,address,phone,emil,office,salary,workday,titlename:\n");
		String name4=scanner.next();
		String address4=scanner.nextLine();
		String phone4=scanner.nextLine();
		String emil4=scanner.nextLine();
		int office4=scanner.nextInt();
		int salary4=scanner.nextInt();
			//mydate类
			System.out.println("Please input Faculty workday:\n");
//			MyDate mydate=new MyDate();
			mydate.inputtime();
			String str3=(mydate.year+"."+mydate.month+"."+mydate.day);
		String titlename4=scanner.next();
		Staff staff=new Staff(name4, address4, phone4, emil4, office4, salary4, str3, titlename4);
		System.out.println("Staff:"+staff.toString());


	}

}
