package package1;

public class Arthmetic {
	
	//(10+2)(8-2) calculation

	public int sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("sum result is "+ c);
		return c;

	}
	
	public int subtract(int x, int y) {
		int z;
		z = x -y;
		System.out.println("sub result is "+ z);
		return z;
		
	}
	
	public void multi(int r1, int r2) {
		int result;
		result = r1 * r2;
		System.out.println("Final result "+ result);
		
	}
	
	public static void main(String[]args) {
		Arthmetic ob = new Arthmetic();
		int sumresult = ob.sum(10, 2);
		int subresult = ob.subtract(8, 2);
		ob.multi(sumresult,subresult);
		
	}
	
}
