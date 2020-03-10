import java.util.Scanner;
public class ArmstrongNumber
{
	int digits=0,temp,number,rem,opt,start,stop;
	double sum=0;
	public void Armstrong(int start,int stop)
	{
		while(start<=stop)
		{
			temp=start;
			while(start>0)
			{
				start=start/10;
				digits++;
			}
			start=temp;
			while(start>0)
			{
				rem=start%10;
				sum=sum+Math.pow(rem,digits);
				start=start/10;
			}
			start=temp;
			if(sum==start)
			{
				System.out.println(start);
			}
			start++;
			digits=0;
			sum=0;
		}
	}
	public void input()
	{
		System.out.println("enter start and stop numbers");
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		stop=s.nextInt();
		
	}
	public void option()
	{
		System.out.println("1.Armstrong Number \n");
		do 
		{
			System.out.println("enter an option");
			Scanner s=new Scanner(System.in);
			opt=s.nextInt();
			if(opt==1)
			{
				input();
				Armstrong(start,stop);
			}
		}	
		while(opt!=0);
	}
	public static void main(String[] args) 
	{
		ArmstrongNumber obj=new ArmstrongNumber();
		obj.option();
	}

}
