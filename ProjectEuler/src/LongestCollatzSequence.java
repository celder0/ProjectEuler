
public class LongestCollatzSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 0;
		long longestSequence = 0;
		int longestCount = 0;
		for(long i = 1; i <= 1000000; i++)
		{
			int count = 0;
			num = i;
			do
			{
				if(num%2 == 0)
				{
					num = num/2;
				}
				else
				{
					num = num*3 + 1;
				}
				//System.out.println(num);
				count ++;
			}while(num!=1);
			System.out.println(i + " " + count);
			
			if (count > longestCount)
			{
				longestCount = count;
				longestSequence = i;
			}
			
		}
		System.out.println(longestSequence);

	}

}
