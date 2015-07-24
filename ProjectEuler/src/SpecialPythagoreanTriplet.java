
public class SpecialPythagoreanTriplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPTriplet(3,4,5));
		for (int i = 1000; i > 0; i--)
		{
			for (int j = 0; j <= 1000 - i; j ++)
			{
				for (int k = 0; k <= 1000 - i - j; k ++)
				{
					if (k + j + i == 1000)
					{
						if(isPTriplet(k,j,i)){
							System.out.println(k*j*i);
						}
					}
				}
			}
		}
	}
	
	public static boolean isPTriplet(int a, int b, int c)
	{
		if(c>b && b>a )
		{
			if(a*a + b*b == c*c)
			{
				return true;
			}
		}
		return false;
	}

}
