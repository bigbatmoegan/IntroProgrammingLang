public class Reference
{
	private int x;
	private int y;
	
	public Reference()
	{
		x=10;
		y=20;
	}
	
	public Reference(int a, int b)
	{
		x=a;
		y=b;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setValues(int a, int b)
	{
		x=a;
		y=b;
	}
}