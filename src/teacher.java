/*
 * This code is helper code for the solution for 12.25
 * it help to create a teacher object that contain first name.last name and salary
 */
public class teacher
{
	private String firstName;
	private String lastName;
	private String salaryString;
	private double salary;
	
	//no-arg constructor
	public teacher()
	{
		
	}
	
	//constructor with parameter
	public teacher(String fname, String lname,String salary)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.salaryString = salary;
		this.salary = Double.parseDouble(salaryString);
	}
	
	//setter
	public void setFName(String fname)
	{
		this.firstName = fname;
	}
	public void setLName(String lname)
	{
		this.lastName = lname;
	}
	//will set salary with string but will parse it to double
	public void setSalary(String salary)
	{
		this.salaryString = salary;
		this.salary = Double.parseDouble(salaryString);
	}
	
	//getter
	public String getFName()
	{
		return this.firstName;
	}
	public String getLName()
	{
		return this.lastName;
	}
	public Double getSalary()
	{
		return this.salary;
	}
	
}
