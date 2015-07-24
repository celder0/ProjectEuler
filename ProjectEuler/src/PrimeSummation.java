
import java.util.ArrayList;

public class PrimeSummation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(3);
		for (int i = 6; i < 300000000; i+=6)
		{
			if(isPrime(array, i - 1))
			{
				System.out.println(i-1);
				array.add(i-1);	
			}
			if(isPrime(array, i + 1))
			{
				System.out.println(i+1);
				array.add(i+1);	
			}
		}
		for (int j = 0; j < array.size(); j++)
		{
			sum = sum + array.get(j);
		}
		System.out.println(sum);
		System.out.println(array.size());
	}

	public static boolean isPrime(ArrayList<Integer> array, float num){
		for (int j = 0; array.get(j) <= Math.sqrt(num); j++)
		{
			if(num%array.get(j)==0)
			{
				return false;
			}
		}
		return true;
		
	}
}