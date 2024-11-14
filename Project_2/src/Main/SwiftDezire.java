package Main;

public class SwiftDezire extends Swift
{
	public static void m3() {
		System.out.println("Grand kid");
	}

public static void main(String[] args) {
	Swift  s = new Swift();
	s.m2();
	s.m1();
	SwiftDezire.m3();
}
}
