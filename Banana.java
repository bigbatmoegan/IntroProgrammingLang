public class Banana extends Human
{
	protected boolean hasSkin;
	protected boolean isEdible;
	protected boolean isHuman;
	
	public Banana()
	{
		//Default constructor
		hasSkin=false;
		isEdible=true;
		isHuman=false;
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