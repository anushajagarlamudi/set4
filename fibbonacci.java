import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=1,b=1,c=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			System.out.println(a);
			 else
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
	}
}
