import java.util.Scanner;
public class TriangleValidity
{

	public static void main(String[] args)
	{
		int angle1,angle2,angle3,sum;
		System.out.println("enter 3 angles of a triangle");
		Scanner s=new Scanner(System.in);
		angle1=s.nextInt();
		angle2=s.nextInt();
		angle3=s.nextInt();
		sum=angle1+angle2+angle3;
		if(sum==180 && angle1!=0 && angle2!=0 && angle3!=0)
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is invalid");
		}
	}

}
