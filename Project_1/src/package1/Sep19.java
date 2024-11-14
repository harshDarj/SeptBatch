package package1;

public class Sep19 {
	
	public void m1()
	{
		System.out.println("Method1......");
	}
	
	public void m2()
	{
		System.out.println("Method2......");
	}
	public void m3()
	{	this.m1();
		System.out.println("Method3......");
		this.m2();
	}
	public static void main(String[]args) {
		Sep19 s = new Sep19();
		s.m3();
	}

}
