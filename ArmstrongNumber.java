
import java.util.Scanner;
public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		int number,digits=1,temp,remainder;
		double sum=0;
		
		System.out.println("Enter number to check if it is armstrong number or not");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		temp=number;
		while(number!=0)
		{
			number=number/10;
			digits++;
		}
		number=temp;
		while(number!=0)
		{
			remainder=number/10;
			sum=sum+Math.pow(remainder,digits);
			number=number/10;
		}
		number=temp;
		if(number==sum)
		{
			System.out.println("number is armstrong"+number);
		}
	}

}
