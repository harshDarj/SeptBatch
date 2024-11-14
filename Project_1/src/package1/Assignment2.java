package package1;

public class Assignment2 {
	
	//((((10*2)-2)-2)+2)/2)
	
		public int multi(int a , int b) {
			int c = a * b;
			System.out.println("Multi result is "+ c);
			return c;
			
		}
		
		public int Subtract(int c,int d) {
			int e = c - d;
			System.out.println("Subtract result is " + e);
			return e;
		}
		
		public int Sum(int g , int h) {
			
			int i = g + h;
			System.out.println("Sum result is "+ i);
			return i;
			
		}
		
		public int division(int i , int j) {
			
			int K = i / j;
			System.out.println("Division result is "+ K);
			return K;
			
		}
		
		public static void main(String[]args) {
			Assignment2 Result = new Assignment2();
			int multiresult =Result.multi(10, 2);
			int subresult =Result.Subtract(multiresult, 2);
			int subresult1 =Result.Subtract(subresult, 2);
			int Sumresult = Result.Sum(subresult1,2);
			int divisionresult =Result.division(Sumresult, 2);
			System.out.println("Final result is " + divisionresult);
			
		}


}
