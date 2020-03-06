import java.util.Scanner;
public class Factors
{

	public static void main(String[] args)
	{
		int number,i=1;
		System.out.println("enter a number to find the factors");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		while(i<=number/2)
		{
			if(number%i==0)
			{
				System.out.println("factors are "+i);
			}
			i++;
		}
	}
}
