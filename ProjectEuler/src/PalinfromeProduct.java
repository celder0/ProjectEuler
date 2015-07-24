
public class PalinfromeProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 998001; i > 0; i --)
		{
			String integer = Integer.toString(i);
			if(isPalindrome(integer))
			{
				for(int j = 999; j > 0; j--)
				{
					if(i%j == 0)
					{
						if(Integer.toString(i/j).length() == 3)
						{
							System.out.println(j);
							System.out.println(i/j);
							System.out.println(integer);
							break;
						}
					}
				}
			}
		}

	}
	
	public static boolean isPalindrome(String str)
	{
			char startLetter = str.charAt(0); 
			char endLetter = str.charAt(str.length()-1);
			//System.out.println(startLetter);
			//System.out.println(endLetter);
			if(startLetter == endLetter)
			{
				if(str.length()==2 || str.length()==1)
				{
					return true;
				}else
				{
					if(isPalindrome(str.substring(1, str.length()-1)))
					{
						//System.out.println(str);
						return true;
					}
				}
			}
			return false;
	}

}
