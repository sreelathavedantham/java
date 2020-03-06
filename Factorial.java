import java.util.Scanner;
public class Factorial 
{

	public static void main(String[] args)
	{
		int number,factorial=1,temp;
	    System.out.println("enter a number");
	    Scanner s=new Scanner(System.in);
	    number=s.nextInt();
	    temp=number;
	    while(number>=1)
	    {
	    	factorial=factorial*number;
	    	number--;
	    }
	    System.out.println("factorial of "+temp+" is "+factorial);
	}

}
