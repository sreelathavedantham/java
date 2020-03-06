import java.util.Scanner;
public class Triangles 
{

	public static void main(String[] args)
	{
		int side1,side2,side3;
		System.out.println("enter 3 sides of the triangle");
		Scanner s=new Scanner(System.in);
		side1=s.nextInt();
		side2=s.nextInt();
		side3=s.nextInt();
		if(side1==side2 && side2==side3)
		{
			System.out.println("Equilateral triangle");
		}
		else if(side1==side2 || side1==side3 || side2==side3)
		{
			System.out.println("Isosceles triangle");
		}
		else
		{
			System.out.println("Scalene triangle");
		}
	}

}
