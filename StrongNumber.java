import java.util.Scanner;
public class StrongNumber
{

	public static void main(String[] args) 
	{
		int number,factorial=1,temp,sum=0,remainder;
		System.out.println("enter a number to check if it is a strong number or not");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		temp=number;
		while(number!=0)
		{
			remainder=number%10;
			while(remainder>=1)
			{
				factorial=factorial*remainder;
				remainder--;
			}
			sum=sum+factorial;
			factorial=1;
			number=number/10;
		}
		number=temp;
		if(sum==number)
		{
			System.out.println(number+" is strong");
		}
		else
		{
			System.out.println(number+" is not strong");
		}

	}

}
