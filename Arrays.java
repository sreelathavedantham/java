package ArraysOperation;
import java.util.Scanner;

public class Arrays
{
	int arr[]=new int[10];
	Scanner s=new Scanner(System.in);
	int search,i,j,temp,n,flag=0,value,index;
	public void Search()
	{
		System.out.println("enter search value");
		search=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(search==arr[i])
			{
				flag++;
			}
		}
		if(flag>=1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	public void insertFirst() // 1 2 3 4 5 6 
	{
		System.out.println("enter a value to insert");
		value=s.nextInt();
		for(i=n;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=value;
		for(i=0;i<n+1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void insertLast()
	{
		System.out.println("enter a value to insert");
		value=s.nextInt();
		arr[n]=value;
		for(i=0;i<n+1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void insertIndex()
	{
		System.out.println("enter a value to insert");
		value=s.nextInt();
		System.out.println("enter a index position to insert");
		index=s.nextInt();
		for(i=n;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=value;
		for(i=0;i<n+1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void deleteFirstOcc()
	{
		System.out.println("enter an element to delete");
		search=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(search==arr[i])
			{
				flag=1;
				for(j=0;j<n;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		if(flag==0)
		{
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			for(i=0;i<n-1;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public void deleteLastOcc()
	{
		System.out.println("enter an element to delete");
		search=s.nextInt();
		for(i=n-1;i>=0;i--)
		{
			if(search==arr[i])
			{
				flag=1;
				for(j=i;j<n;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		if(flag==0)
		{
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			for(i=0;i<n-1;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public void deleteIndex()
	{
		System.out.println("enter index position to delete");
		index=s.nextInt();
		for(i=index;i<n;i++)
		{
			arr[i]=arr[i+1];
		}
		for(i=0;i<n-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void deleteAllOcc()
	{
		System.out.println("enter an element to delete");
		search=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(search==arr[i])
			{
				flag=1;
				for(j=i;j<n;j++)
				{
					arr[j]=arr[j+1];
				}
				n--;
				i=-1;
			}
		}
		if(flag==0)
		{
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public void frequency()
	{
		int count=1;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
				}
			}
			if(arr[i]!=0)
			{
				System.out.println(arr[i]+" : "+count);
			}
			count=1;
		}	
	}
	public void unique()
	{
		int count=1;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
				}
			}
			if(arr[i]!=0 && count==1)
			{
				System.out.println(arr[i]);
			}
			count=1;
		}
	}
	public void duplicate()
	{
		int count=1;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
				}
			}
			if(arr[i]!=0 && count>1)
			{
				System.out.println(arr[i]);
			}
			count=1;
		}
	}
	public void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println();
		}
	}
	public void input()
	{
		System.out.println("enter n value");
		n=s.nextInt();
		System.out.println("enter "+n+" values");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	public void options()
	{
		int opt;
		System.out.println("1.search \n2.insert first \n3.insert last  \n4.insert index \n5.delete first \n6.delete last \n7.delete index \n8.delete all \n9.frequency of an element \n10.unique elements \n11.duplicate elements \n");
		do
		{
			System.out.println("enter an option");
			opt=s.nextInt();
			if(opt==1)
			{
				input();
				Search();
			}
			if(opt==2)
			{
				input();
				insertFirst();
			}
			if(opt==3)
			{
				input();
				insertLast();
			}
			if(opt==4)
			{
				input();
				insertIndex();
			}
			if(opt==5)
			{
				input();
				deleteFirstOcc();
			}
			if(opt==6)
			{
				input();
				deleteLastOcc();
			}
			if(opt==7)
			{
				input();
				deleteIndex();
			}
			if(opt==8)
			{
				input();
				deleteAllOcc();
			}
			if(opt==9)
			{
				input();
				frequency();
			}
			if(opt==10)
			{
				input();
				unique();
			}
			if(opt==11)
			{
				input();
				duplicate();
			}
		}
		while(opt!=0);
	}
	public static void main(String[] args) 
	{
		Arrays obj=new Arrays();
		obj.options();
	}

}
