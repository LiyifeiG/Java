package 哈哈哈哈;

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
		return "我是："+this.name+", 今年："+this.age+"岁。";
	}
}
public class 类 
{
	public static void main(String[] args)
	{
		person p[]={new person("张三",25),new person("李四",30),new person("王五",35)};
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].talk());
		}
	}
}
