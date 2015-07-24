
public class LatticePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[][] pathArray = new long[20][20];
		long mostPaths = 0;
		for (long i = 0; i <pathArray.length; i++){
			for (long j = 0; j < pathArray[(int) i].length; j++)
			{
				if(i == 0)
				{
					pathArray[(int) i][(int) j] = j+2;
				}
				if(j == 0)
				{
					pathArray[(int) i][(int) j] = i+2;
				}
				if(i != 0 && j !=0)
				{
					pathArray[(int) i][(int) j] = pathArray[(int) i][(int) (j-1)] + pathArray[(int) (i-1)][(int) j];
				}
				mostPaths = pathArray[(int) i][(int) j];
				System.out.println(mostPaths);
			}
		}
	}

}
