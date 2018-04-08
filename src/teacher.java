
public class teacher
{
	private String firstName;
	private String lastName;
	private String salaryString;
	private double salary;
	
	public teacher()
	{
		
	}
	
	public teacher(String fname, String lname,String salary)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.salaryString = salary;
		this.salary = Double.parseDouble(salaryString);
	}
	
	public void setFName(String fname)
	{
		this.firstName = fname;
	}
	public void setLName(String lname)
	{
		this.lastName = lname;
	}
	public void setSalary(String salary)
	{
		this.salaryString = salary;
		this.salary = Double.parseDouble(salaryString);
	}
	
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
