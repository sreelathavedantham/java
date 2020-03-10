package Strings;
import java.util.Scanner;
public class Stringss
{
	String str;
	int i,j;
	String words[]=new String[20];
	public void wordCount()
	{
		String words[]=str.split(" ");
		System.out.println(words.length);
	}
	public void numberOfCharacters()
	{
		int count=0;
                     String words[]=str.split(" ");		
		for(i=0;i<words.length;i++)
		{
			for(j=0;j<words[i].length();j++)
			{
					count++;
			}
			System.out.println(words[i]+count);
			count=0;
		}
	}
	public void reverse()
	{
		String words[]=str.split(" ");
		for(i=words.length-1;i>=0;i--)
		{
			System.out.println(words[i]);
		}
	}
	public void frequencyOfEachWord()
	{
		String words[]=str.split(" ");
		int count=1;
		for(i=0;i<words.length;i++)
		{
			for(j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]=" ";
				}
			 }
			if(words[i]!=" ")
			{
				System.out.println(words[i]+":"+count);

			}	
			count=1;
		 }
	}
	public void uniqueWords()
	{
		String words[]=str.split(" ");
		int count=1;
		for(i=0;i<words.length;i++)
		{
			for(j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]=" ";
				}
			}
				if(words[i]!=" " && count==1)
				{
					System.out.println(words[i]);
				}	
				count=1;
		}
	}
	public void duplicateWords()
	{
		String words[]=str.split(" ");
		int count=1;
		for(i=0;i<words.length;i++)
		{
			for(j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]=" ";
				}
			}
				if(words[i]!=" " && count>1)
				{
					System.out.println(words[i]);

				}	
				count=1;
		}
	}
	public void inputString()
	{
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		str=s.nextLine();	
	}
	public void display()
	{
		int i;
		for(i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}
	public void options()
	{
		int opt;
		System.out.println("1.word count \n2.number of characters \n3.reverse \n4.frequency of each word \n5.unique words \n6.duplicate words \n");	
		do
		{
			System.out.println("enter option");
			Scanner s=new Scanner(System.in);
			opt=s.nextInt();
			if(opt==1)
			{
				inputString();
				wordCount();
			}
			if(opt==2)
			{
				inputString();
				numberOfCharacters();
			}
			if(opt==3)
			{
				inputString();
				reverse();
			}
			if(opt==4)
			{
				inputString();
				frequencyOfEachWord();
			}
			if(opt==5)
			{
				inputString();
				uniqueWords();
			}
			if(opt==6)
			{
				inputString();
				duplicateWords();
			}
		}
		while(opt!=0);
	}
	
	public static void main(String[] args)
	{
		Stringss obj=new Stringss();
		obj.options();
	}

}
