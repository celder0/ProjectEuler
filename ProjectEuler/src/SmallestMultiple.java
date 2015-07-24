
public class SmallestMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 1000000000;i++)
		{
			if(divisibleBy(i,20))
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean divisibleBy(int num, int div)
	{
		if (div == 0)
		{
			return true;
		}
		else if (num%div == 0)
		{
			return divisibleBy(num,div-1);
		} 
		else
		{
			return false;
		}
	}

}
