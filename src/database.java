import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("resource")
public class database 
{
	public static void main(String[] args)
	{
		ArrayList<teacher> falculty = new ArrayList<>();
		ArrayList<teacher> assistant = new ArrayList<>();
		ArrayList<teacher> full = new ArrayList<>();
		ArrayList<teacher> associate = new ArrayList<>();
		
		try
		{
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");		
			Scanner input = new Scanner(url.openStream()); 
			while (input.hasNext()) 
			{
				String line = input.nextLine();
				String[] facultyInfo = line.split(" ");
				falculty.add(new teacher(facultyInfo[0], facultyInfo[1], facultyInfo[3]));;
				if(facultyInfo[2].equals("assistant"))
				{
					assistant.add(new teacher(facultyInfo[0], facultyInfo[1], facultyInfo[3]));
				}
				else if(facultyInfo[2].equals("associate"))
				{
					associate.add(new teacher(facultyInfo[0], facultyInfo[1], facultyInfo[3]));
				}
				else
				{
					full.add(new teacher(facultyInfo[0], facultyInfo[1], facultyInfo[3]));
				}
			}
			System.out.println("This is the total salary of different professor:");
			System.out.println("The total salary of all professors is : $" + String.format("%.2f",getTotal(falculty)));
			System.out.println("The total salary of assistant professors is : $" + String.format("%.2f",getTotal(assistant)));
			System.out.println("The total salary of associate professors is : $" + String.format("%.2f",getTotal(associate)));
			System.out.println("The total salary of full professors is : $" + String.format("%.2f",getTotal(full)));
			System.out.println("\nThis is the average salary of different professor:");
			System.out.println("The average salary of all professors is : $" + String.format("%.2f",getAverage(falculty)));
			System.out.println("The average salary of assistant professors is : $" + String.format("%.2f",getAverage(assistant)));
			System.out.println("The average salary of associate professors is : $" + String.format("%.2f",getAverage(associate)));
			System.out.println("The average salary of full professors is : $" + String.format("%.2f",getAverage(full)));
		
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
	
	public static double getAverage(ArrayList<teacher> array)
	{ 
		double total = 0;
		for(teacher faculty:array)
		{   
			total += faculty.getSalary();
		}
		double average = total/array.size();
		return average;
	}
	public static double getTotal(ArrayList<teacher> array)
	{ 
		double total = 0;
		for(teacher faculty:array)
		{   
			total += faculty.getSalary();
		}
		return total;
	}
}
