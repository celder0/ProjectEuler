
public class EvenFibonacciSums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 1;
		int evenSum = 0;
		while(fib(n) < 4000000) {
			if(fib(n)%2 == 0)
			{
				evenSum = evenSum + fib(n);
				System.out.println(evenSum);
			}
			n++;
		}
	}
	
	private static int fib(int n)
	{
		if(n==1 || n==2) return n;
		return fib(n-1) + fib(n-2);
	}

}
