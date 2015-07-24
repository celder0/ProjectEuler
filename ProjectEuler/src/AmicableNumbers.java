import java.util.ArrayList;


public class AmicableNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int currentValue = 0;
		int possibleAmicable = 0;
		int sum = 0;
		for(int i = 1; i < 10000; i++)
		{
			numList.add(i);
		}
		for(int num = 0; num < numList.size(); num++)
		{
			currentValue = numList.get(num);
			possibleAmicable = sumOfDivisors(currentValue);
			if(currentValue == possibleAmicable || currentValue != sumOfDivisors(possibleAmicable))
			{
				num = numList.indexOf(currentValue) - 1;
				numList.remove(numList.indexOf(currentValue));				
				numList.trimToSize();
			}
		}
		for(int num = 0; num < numList.size(); num++)
		{
			System.out.println(numList.get(num));
			sum += numList.get(num);
		}
		System.out.print(sum);
	}
	
	public static int sumOfDivisors(int n)
	{
		int sum = 0;
		if(n%Math.sqrt(n) == 0)
			sum+= Math.sqrt(n);
		for(int i = 1; i < n; i++)
		{
			if(n%i == 0)
				sum+= i;
		}
		return sum;
	}

}
