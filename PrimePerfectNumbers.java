//non parameterized
import java.util.Scanner;
public class PrimePerfectNumbers
{
	int opt,number,i,count=0,sum=0;
	public void PrimeNumber()
	{
		count=0;
		for(i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count++;
			}
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
	public void PerfectNumber()
	{
		sum=0;
		for(i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if(number==sum)
		{
			System.out.println(number+" is a perfect number");
		}
		else
		{
			System.out.println(number+" is not a perfect number");
		}
	}
	public void options()
	{
		System.out.println("1.Prime Number \n2.Perfect Number \n");
		do 
		{
		System.out.println("enter an option");
		Scanner s=new Scanner(System.in);
		opt=s.nextInt();
		if(opt==1)
		{
			input();
			PrimeNumber();
			
		}
		if(opt==2)
		{
			input();
			PerfectNumber();
		}
		}
		while(opt!=0);
	}
	public void input()
	{
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		
	}
	public static void main(String[] args) 
	{
		PrimePerfectNumbers obj=new PrimePerfectNumbers();
		obj.options();
	}

}
