import java.util.*;

public class Driver
{
	public static void main (String [] args)
	{
		int a, b, c, d;
		Reference refA=new Reference();
		Reference refB=new Reference(30,90);
		a=refA.getX();
		b=refA.getY();
		c=refB.getX();
		d=refB.getY();
		System.out.format("Values of First point object: X= %-1s Y= %-1s \n", a, b);
		System.out.format("Values of Second point object: X= %-1s Y= %-1s \n", c, d);
		System.out.println("Swapping values of points.");
		refA.setValues(c,d);
		refB.setValues(a,b);
		System.out.println("Values after swap. ");
		a=refA.getX();
		b=refA.getY();
		c=refB.getX();
		d=refB.getY();
		System.out.format("Values of First point object: X= %-1s Y= %-1s \n", a, b);
		System.out.format("Values of Second point object: X= %-1s Y= %-1s \n", c, d);
		
	}
}