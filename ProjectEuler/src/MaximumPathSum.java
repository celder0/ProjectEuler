
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MaximumPathSum {

	public static void main(String[] args) {
		String[][] triangle = null;
		int rows = 0;
		int columns = 0;
		try (BufferedReader br = Files.newBufferedReader(Paths.get("Triangle.txt"), StandardCharsets.UTF_8))
		{
			String sCurrentLine;
			br.mark(100000);
			while ((sCurrentLine = br.readLine()) != null) {
				rows ++;
				columns = sCurrentLine.split("\\s+").length;
			}
			triangle = new String[rows][];
			System.out.println(columns);
			for (int i = 0; i < rows - 1; i++)
			{
				triangle[i] = new String[i*2+1];
			}
			br.reset();
			rows = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				
					triangle[rows] = sCurrentLine.split("\\s+");
					for (int i = 0; i < triangle[rows].length; i++ )
					{
						System.out.print(triangle[rows][i] + " ");
					}
					System.out.println();
				rows++;
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		System.out.println(maximumPath(triangle));
	}
	
	private static int maximumPath(String[][] array)
	{
		int max = 0;
		for (int i = array.length-1; i >0; i--)
		{
			for(int j = 0; j < array[i].length - 1; j++)
			{
				if(Integer.parseInt(array[i][j]) > Integer.parseInt(array[i][j+1]))
				{
					array[i-1][j] = String.valueOf(Integer.parseInt(array[i-1][j]) + Integer.parseInt(array[i][j]));
				}
				else
				{
					array[i-1][j] = String.valueOf(Integer.parseInt(array[i-1][j]) + Integer.parseInt(array[i][j+1]));
				}
				System.out.print(array[i-1][j] + " ");
			}
			System.out.println();
		}
		max = Integer.parseInt(array[0][0]);
		return max;
	}
}
