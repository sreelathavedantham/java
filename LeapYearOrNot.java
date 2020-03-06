import java.util.Scanner;
public class LeapYearOrNot
{

	public static void main(String[] args)
	{
		int year;
		System.out.println("Enter year");
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if(((year%4==0 && year%100!=0)) || (year%400==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}

	}
}
