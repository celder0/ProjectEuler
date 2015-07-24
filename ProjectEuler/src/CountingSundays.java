
public class CountingSundays {

	public static void main(String[] args) {
		int year = 1901;
		int month = 1;
		int day = 2;
		int count = 0;
		while (year<2001)
		{
			month = 1;
			while (month < 13)
			{
				if(month == 2)
				{
					if(year%4 == 0)
					{
						if ((day = (day+29)%7) == 0)
						{
							count++;
							//System.out.print(day);
						}
					}else if ((day = (day+28)%7) == 0)
					{
						count++;
						//System.out.print(day);
					}
				}else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				{
					if ((day = (day+31)%7) == 0)
					{
						count++;
						//System.out.print(day);
					}
				}else if ((day = (day+30)%7) == 0)
				{
					count++;
					//System.out.print(day);
				}
				month++;
			}
			year++;
		}
		System.out.print(count);
	}

}
