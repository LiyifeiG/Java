package com.liyifei.test02;
import java.util.Scanner;


class student{
	String name;
	int score;	
}

public class ѧ���ɼ���� {
	
	public static void main(String[] args) {
		int i,j;
		student b=new student();
		Scanner scanner=new Scanner(System.in);
		student[] stu=new student[3];
		for(i=0;i<stu.length;i++){
			System.out.println("�����"+(i+1)+"��ѧ����name��score:");
			stu[i]=new student();
			System.out.print("name:");
			stu[i].name=scanner.nextLine();
			System.out.print("score:");
			stu[i].score=scanner.nextInt();
			scanner.nextLine();
			
		}
		for(i=0;i<stu.length;i++)
		{
			for(j=i+1;j<stu.length;j++){
				if(stu[i].score>stu[j].score){
					b=stu[i];
					stu[i]=stu[j];
					stu[j]=b;
				}
			}
		}
		for(i=0;i<stu.length;i++){
			System.out.println("��"+(i+1)+"��ѧ����name��score:"+stu[i].name+"  "+stu[i].score);
		}

	}

}
