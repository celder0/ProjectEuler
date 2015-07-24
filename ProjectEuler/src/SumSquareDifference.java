
public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int squareSum = 0;
		for (int i = 0; i <= 100; i++)
		{
			sum = i + sum;
			squareSum = i*i + squareSum;
		}
		int difference = sum * sum - squareSum;
		System.out.println(difference);
	}

}
