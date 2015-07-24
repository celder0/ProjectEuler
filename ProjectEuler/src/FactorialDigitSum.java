import java.math.BigInteger;


public class FactorialDigitSum {

	public static void main(String[] args) {
		System.out.println(digitSum((factorial(BigInteger.valueOf(100L)).toString())));
	}
	
	private static BigInteger factorial(BigInteger input)
	{
		if(input.equals(BigInteger.ONE)) return input;
		return input.multiply(factorial(input.subtract(BigInteger.ONE)));
	}
	
	private static String digitSum(String num)
	{
		int sum  = 0;
		for (int i = num.length()-1; i >= 0; i --)
		{
			System.out.println(num.charAt(i));
			sum += Character.getNumericValue(num.charAt(i));
		}
		return Integer.toString(sum);
	}

}
