import java.math.BigInteger;


public class PowerDigitSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numString = "";
		long sum = 0;
		BigInteger num = new BigInteger("2");
		num = num.pow(1000);
		numString = num.toString();
		System.out.println(numString);
		for (int i = 0; i < numString.length(); i++)
		{
			sum += Character.getNumericValue(numString.charAt(i));
		}
		
		System.out.println(sum);
		

	}

}
