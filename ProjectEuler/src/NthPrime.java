
public class NthPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(prime(10001));

	}
	
	public static int prime(int nth){
		int prime = 0;
		int count = 1;
		int test = 3;
		do{
			
			if(isPrime(test))
			{
				count++;
				prime = test;
				System.out.println(prime);
			}
			
			test = test + 2;
		} while (count<=nth-1);
		
		return prime;
	}
	
	public static boolean isPrime(int num){
		for (int i = num -1; i > 1; i--)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
		
	}

}
