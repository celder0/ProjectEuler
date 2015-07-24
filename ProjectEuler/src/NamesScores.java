import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;


public class NamesScores {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		BigInteger sum = BigInteger.ZERO;
		String name = null;
		long position = 1;
		try (BufferedReader br = Files.newBufferedReader(Paths.get("names.txt"), StandardCharsets.UTF_8))
		{
			String sCurrentLine;
			String[] holder = null;
			while ((sCurrentLine = br.readLine()) != null) {
				sCurrentLine = sCurrentLine.replaceAll("\"", "");
				holder = sCurrentLine.split(",");
			}
			for (int i = 0; i < holder.length; i++)
			{
				names.add(holder[i]);
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		while((name = names.pollFirst()) != null)
		{
			sum =  sum.add(BigInteger.valueOf(nameScore(name,position)));
			position++;
		}
		System.out.print(sum);
	}
	
	private static long nameScore(String name, long position)
	{
		long score=0;
		for(int i =0; i<name.length(); i++)
		{
			score+= Character.getNumericValue(name.charAt(i))-9;
		}
		score *= position;
		return score;
	}

}
