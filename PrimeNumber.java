import java.util.Scanner;
public class PrimeNumber
{

	public static void main(String[] args)
	{
		int number,i=1,count=0;
		System.out.println("enter number to find if it is prime or not");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		while(i<=number/2)
		{
			if(number%i==0)
			{
				count++;
				System.out.println(i);
			}
			i++;
		}
		if(count==1)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}

	}

}
