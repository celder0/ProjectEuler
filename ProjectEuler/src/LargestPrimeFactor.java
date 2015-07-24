
public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long prime = 600851475143L;
		//prime = 13195;
		//System.out.println(prime);
		int i = 2;

		do
		{
			if (prime%i == 0)
			{
				if (isPrime(i))
				{
					System.out.println(i);
				}
				//System.out.println(prime);
				prime = prime/i;
			}
			else
			{
				i = i + 1;
			}
		}while(prime>1);
		
	}
	public static boolean isPrime(float num){
		for (float i = num -1; i > 1; i--)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
		
	}


}
