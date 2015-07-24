
public class NumberLetterCounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(int i = 0; i < 1001; i++)
		{
			sum += numberOfLetters(i);		
		}
		System.out.println(sum);
	}
	
	private static int numberOfLetters(int n)
	{
		String unit[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String teens[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String tens[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		int numCount= 0;
		if (n == 1000)
		{
			return 11;
		}
		if(n > 99 && n<1000)
		{
			numCount+=7; //hundred
			numCount += unit[Character.getNumericValue(Integer.toString(n).charAt(0))].length(); //units
			if(Character.getNumericValue(Integer.toString(n).charAt(1)) !=  1)
			{
				numCount += tens[Character.getNumericValue(Integer.toString(n).charAt(1))].length(); //tens
				numCount += unit[Character.getNumericValue(Integer.toString(n).charAt(2))].length(); //units
			}
			else
			{
				numCount += teens[Character.getNumericValue(Integer.toString(n).charAt(2))].length(); //teens
			}
			if(Character.getNumericValue(Integer.toString(n).charAt(1)) == 0 && Character.getNumericValue(Integer.toString(n).charAt(2)) == 0)
			{
				
			}	
			else
			{
				numCount += 3; //and
			}
		}
		if(n<100 && n > 9)
		{
			if(Character.getNumericValue(Integer.toString(n).charAt(0)) !=  1)
			{
				numCount += tens[Character.getNumericValue(Integer.toString(n).charAt(0))].length(); //tens
				numCount += unit[Character.getNumericValue(Integer.toString(n).charAt(1))].length(); //units
			}
			else
			{
				numCount += teens[Character.getNumericValue(Integer.toString(n).charAt(1))].length(); //teens
			}
		}
		if(n>0 && n <10)
		{
			numCount += unit[Character.getNumericValue(Integer.toString(n).charAt(0))].length(); //unit
		}
		return numCount;
	}

}
