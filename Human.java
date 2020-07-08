public class Human
{
	private String firstName;
	private String lastName;
	protected boolean hasSkin;
	protected boolean isEdible;
	protected boolean isHuman;
	
	public Human()
	{
		//Default constructor
		firstName="";
		lastName="";
		hasSkin=true;
		isEdible=false;
		isHuman=true;
	}
	
	public Human(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		hasSkin=true;
		isEdible=false;
		isHuman=true;
	}
	
	public String getName()
	{
		return firstName+" "+lastName;
	}
	
	public boolean hasSkin()
	{
		return hasSkin;
	}
	
	public boolean isEdible()
	{
		return isEdible;
	}
	
	public boolean isHuman()
	{
		return isHuman;
	}
}