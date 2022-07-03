/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		for(int i=0;i<=n;i++){
			for(int j=0;j<60;j++){
				for(int k=0;k<60;k++){
					if(i%10==3||i/10==3||j%10==3||j/10==3||k%10==3||k/10==3)
						count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
