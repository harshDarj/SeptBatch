package package1;

public class Assignment {

	public Assignment()
	{
		this(10,20,30);
		
		System.out.println("Default constructor ");
	}
	public Assignment(int x)
	{
		this(10,20);
		System.out.println("one Paramiterized constructor ");
	}
	public Assignment(int x,int z)
	{
		this();
		System.out.println("Two Paramiterized constructor ");
	}
	public Assignment(int x,int z,int y)
	{
		
		System.out.println("Three Paramiterized constructor ");
	}
		
	public static void main(String[]args)
	{	
		
		Assignment A1 = new Assignment(555); // will call one parameterized
	}
}
