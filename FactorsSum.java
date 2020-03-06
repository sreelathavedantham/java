import java.util.Scanner;
public class FactorsSum 
{

	public static void main(String[] args)
	{
		int number,i=1,sum=0;
		System.out.println("Enter a number to print factors");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		while(i<=number/2)
		{
			if(number%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
			i++;
		}
		System.out.println("sum of factors : "+sum);
	}

}
