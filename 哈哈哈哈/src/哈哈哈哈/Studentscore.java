package 込込込込;

import java.util.Scanner;

class Student{
	String name;
	int score;
}

public class Studentscore {

	public static void main(String[] args)
	{
		int i,sum,t;
		sum=0;
		Scanner scanner=new Scanner(System.in);
		Student[] stu=new Student[3];
		for(i=0;i<stu.length;i++)
		{
			stu[i]=new Student();
			System.out.println("please enter stuent"+(i+1)+"'s name:");
			stu[i].name=scanner.next();
			System.out.println("please enter stuent"+(i+1)+"'s score:");
			stu[i].score=scanner.nextInt();
		}
		for(i=0;i<stu.length;i++){
			sum=sum+stu[i].score;
		}
		t=sum/stu.length;
		System.out.println("average score:"+t+"  "+"sum:"+sum);

	}

}
