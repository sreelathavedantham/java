import java.util.Scanner;
public class ElectricityBills
{

	public static void main(String[] args)
	{
		int units;
		double bill;
		System.out.println("enter number od units");
		Scanner s=new Scanner(System.in);
		units=s.nextInt();
		if(units<=50)
		{
			bill=(units*0.50);
		}
		else if(units<=150)
		{
			bill=(50*0.50)+(units-50)*0.75;
		}
		else if(units<=250)
		{
			bill=(50*0.50)+(100*0.75)+(units-150)*1.20;
		}
		else
		{
			bill=(50*0.50)+(100*0.75)+(100*1.20)+(units-250)*1.50;
		}
		bill=bill+(bill/100)*20;
		System.out.println("Final bill : "+bill);
	}

}
