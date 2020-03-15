//1.WAP to return highest occurred character in a String
//2. WAP to find duplicate characters in a String?
//3. WAP to print the first non-repeated character from a string?
//4. WAP to print longest word in a given string
//5. WAP to remove a given character from String?​
import java.util.Scanner;
public class JavaStrings
{
	String str;
	int count=1;
	String length[]=new String[50];

	public int highestOccurredChar()
	{
		int i,j,max=0,result=0;
		char arr[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					if(max<count)
					{
						max=count;
					   result=arr[i];
					}
				}
			}
		}
			return result;
		
	}
	public void duplicateChar()
	{
		char arr[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		
		if(count>1)
		{
			System.out.println(arr[i]+":"+count);
		}
		count=1;
		}
	}
	public void firstNonRepeatedChar()
	{
		int i,j,count=1;
		char arr[] = str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
				break;
			}
			count=1;
		}
	}
	public void longestWord()
	{
		int i,j;
		String words[]=str.split(" ");
		String longest="";
		for(i=0;i<words.length;i++)
		{
				if(longest.length()<=words[i].length())
				{
					longest=words[i];
				}
		}
		System.out.println("longest word in the given string is"+":"+longest);
	}
	public void removeAchar(String str)
	{
		char charr;
		int i,j;
		System.out.println("Enter a character to remove");
		Scanner s=new Scanner(System.in);
		charr=s.next().charAt(0);
		char arr[] = str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(charr==arr[i])
			{
				for(j=0;i<str.length();j++)
				{
					arr[j]=arr[j+1];
				}
			}
		}
		for(j=0;j<str.length();j++)
		{
			System.out.println(arr[j]);
		}
	}
	public void input()
	{
		System.out.println("enter a string");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
	}
	public void options()
	{
		int opt;
		System.out.println("1.highest occurred character in a String \n2. duplicate characters in a String \n3.first non-repeated character from a string \n4.longest word in a given string \n5.remove a given character from String \n");
		do
		{
			System.out.println("enter an option");
			Scanner s=new Scanner(System.in);
			opt=s.nextInt();
			if(opt==1)
			{
				input();
				highestOccurredChar();
			}
			if(opt==2)
			{
				input();
				duplicateChar();
			}
			if(opt==3)
			{
				input();
				firstNonRepeatedChar();
			}
			if(opt==4)
			{
				input();
				longestWord();
			}
			if(opt==5)
			{
				input();
				removeAchar(str);
			}
		}
		while(opt!=0);
	}
	public static void main(String[] args) 
	{
		JavaStrings obj=new JavaStrings();
		obj.options();

	}

}
