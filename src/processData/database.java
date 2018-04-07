package processData;

import java.util.Scanner;

public class database 
{
	public static void main(String[] args)
	{
		try
		{
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			Scanner input = new Scanner(url.openStream()); 
			while (input.hasNext()) 
			{
				String line = input.nextLine();
				System.out.println(line);
			}
				
		}
		catch (java.net.MalformedURLException ex) 
		{ 
		  System.out.println("Invalid URL");
		}
		catch (java.io.IOException ex) 
		{
			System.out.println("I/O Errors: no such file");
		}
	}
}
