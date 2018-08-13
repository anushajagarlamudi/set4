import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];
		for(int i=1;i<=10;i++)
		{
			a[i]=sc.nextInt();
		}
		 int max=a[1];
		 for(int i=1;i<=10;i++)
		 {
		 	if(a[i]>max)
		 	max=a[i];
		 	
		 }
		 	System.out.println(max);
		 
		
	}
}
