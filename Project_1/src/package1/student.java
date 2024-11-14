package package1;

public class student {
	
	int rollNo; // declared a variable name rollNo
	public void display1(){
		System.out.println("Wellcome to all of you"); // printing a msg
	}
	
	int age; // declare second Variable name age
	public void display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		student deepak = new student();
		deepak.display1();
		deepak.rollNo=12;
		deepak.age = 18;
		deepak.display2();
		System.out.println("value of rollNo "+deepak.rollNo);
		System.out.println("value of age "+deepak.age);
		System.out.println();
		
		student hari = new student();
		hari.display1();
		hari.rollNo=12;
		hari.age = 18;
		hari.display2();
		System.out.println("value of rollNo "+hari.rollNo);
		System.out.println("value of age "+hari.age);
		
		
	}

}
