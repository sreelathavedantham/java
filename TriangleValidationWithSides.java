import java.util.Scanner;
public class TriangleValidationWithSides
{

	public static void main(String[] args) 
	{
		int side1,side2,side3;
		System.out.println("Enter 3 sides of a triangle");
		Scanner s=new Scanner(System.in);
		side1=s.nextInt();
		side2=s.nextInt();
		side3=s.nextInt();
		if((side1+side2)>side3)
		{
			if((side2+side3)>side1)
			{
				if((side1+side3)>side2)
				{
					System.out.println("Triangle is valid");
				}
				else
				{
					System.out.println("Triangle is invalid");
				}
			}
			else
			{
				System.out.println("Triangle is invalid");
			}
		}
		else
		{
			System.out.println("Triangle is invalid");
		}
	}

}
