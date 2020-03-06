import java.util.Scanner;
public class NumberofFactors {

	public static void main(String[] args) {
		int number,i=1,count=0;
		System.out.println("enter a number to find the number of factors");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		while(i<=number/2)
		{
			if(number%i==0)
			{
				count++;
				System.out.println("factors are "+i);
			}
			i++;
		}
		System.out.println("number of factors are : "+count);

	}

}
