package package1;

// 1) its like Method
// 2) Name of constructor will be same as the class name
//3) no return type, even we can not write void also.
//4) no need to call constructor, it will call automatically
public class constructor1 {
	
	public constructor1() {
		System.out.println("Default constructor ");
	}
	public constructor1(int a) {
		
		System.out.println("One Parmeterized constructor ");
		
	}
	
	public static void main(String[]args)
	{
		constructor1 sunny = new constructor1(); // will call default constructor
		constructor1 harshad = new constructor1(); // will call default constructor
		constructor1 krrish = new constructor1(555); // will call one parameterized
	}
	

}
