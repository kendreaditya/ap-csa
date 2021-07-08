//Example of public class without a main method (not runnable)
//Grade Book

public class GradeBook {
	private int periodNumber;
	private String className;
	
	/***********************Constructor********************************/
	// Default Constructor
	public GradeBook()
	{
	}
	
	// Specific Constructor
	public GradeBook(int periodNumber, String className)
	{
		setPeriodNumber(periodNumber);
		setClassName(className);
	}
	/******************************************************************/
	public void setPeriodNumber(int periodNumber)
	{
		this.periodNumber = ((periodNumber>=1 && periodNumber<9) ? periodNumber : 1);
	}
	public int getPeriodNumber()
	{
		return periodNumber;
	}
	   
	public void setClassName(String className)
	{
		this.className = className;
	}
	public String getClassName()
	{
		return className;
	}
	
	public void welcomeMessagle()
	{
		System.out.println("Welcome to "+className);
		System.out.println("This is period "+periodNumber);
	}
}
