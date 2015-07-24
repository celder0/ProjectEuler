
public class TriangularNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long triangleNumber;
		long n = 2;
		do
		{
			triangleNumber = (n*(n+1))/2;
			n++;
			
		}while(numDivisor(triangleNumber) < 500);
		System.out.println(triangleNumber);
	}
	
	public static long numDivisor(long triangleNumber)
	{
		long divisors = 0;
		for (int i = 1; i <= Math.sqrt(triangleNumber); i++)
		{
			if (triangleNumber%i == 0)
			{
				divisors++;
			}
		}
		divisors*=2;
		return divisors;
	}
	

}
