package package1;

public class Assignment1 {
	
	//((((10+2)-2)+2)*2)/2)
	
	public int Sum(int a , int b) {
		int c = a + b;
		System.out.println("sum result is "+ c);
		return c;
		
	}
	
	public int Subtract(int c,int d) {
		int e = c - d;
		System.out.println("Subtract result is " + e);
		return e;
	}
	
	 int multi(int g , int h) {
		
		int i = g * h;
		System.out.println("multi result is "+ i);
		return i;
		
	}
	
	public int division(int i , int j) {
		
		int K = i / j;
		System.out.println("Division result is "+ K);
		return K;
		
	}
	
	public static void main(String[]args) {
		Assignment1 Result = new Assignment1();
		int sumresult =Result.Sum(10, 2);
		int subresult =Result.Subtract(sumresult, 2);
		int Sum1result = Result.Sum(subresult,2);
		int multiresult = Result.multi(Sum1result, 2);
		int divisionresult =Result.division(multiresult, 2);
		System.out.println("Final result is " + divisionresult);
		
	}

}
