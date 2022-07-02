/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		int count =0;
		
		while(n!=1){
			if(n%m==0)
				n=n/m;
			else
				n=n-1;
			count++;
		}
		System.out.println(count);
	}
	
}
