package ex;

public class B 
{
	int a=20;
	void m1()
	{
		System.out.println("m1-B");
	}
	public static void main(String[] args) {
		A aa=new A();
		System.out.println(aa.a);//10
		aa.m1();//m1
	}
}
