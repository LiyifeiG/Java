package ��������;

class person
{
	String name;
	int age;
//	public person()
//	{
		
	//}
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String talk()
	{
		return "���ǣ�"+this.name+", ���꣺"+this.age+"�ꡣ";
	}
}
public class �� 
{
	public static void main(String[] args)
	{
		person p[]={new person("����",25),new person("����",30),new person("����",35)};
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].talk());
		}
	}
}
