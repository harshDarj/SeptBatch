package package1;

public class GlobalandLocalVariable 
{
	int sunny;// global Variable
	public void abc(int sunny)
	{
		this.sunny = sunny; // giving value of local to global
	}
	public static void main(String[]args)
	{
		GlobalandLocalVariable ob = new GlobalandLocalVariable();
		System.out.println(ob.sunny);
		ob.abc(122);
		System.out.println(ob.sunny);
	}

}
