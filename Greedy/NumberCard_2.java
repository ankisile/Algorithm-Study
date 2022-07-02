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
		
		int max =0;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		// Math 이용해서 줄이기
		for(int i=0;i<n;i++) {
			int min = 10001;
			for(int j=0;j<m;j++){
				int item = sc.nextInt();
				min = Math.min(item, min);
			}
			max = Math.max(min, max);
		}
		

		System.out.println(max);

	}
	
}
