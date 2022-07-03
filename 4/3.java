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
		String input = sc.next();
		
		int count =0;
		
		int x = input.charAt(0)-'a'+1;
		int y = input.charAt(1)-'0';
		
		int dx[] ={2,2,-2,-2,1,-1,1,-1};
		int dy[] = {1,-1,1,-1,2,2,-2,-2};

		for(int i=0;i<8;i++){
			int nx=-1, ny=-1;
			nx=x+dx[i];
			ny=y+dy[i];
			
			if(nx<1||ny>8||nx>8||ny<1)
				continue;
			
			count++;
		}
		
		System.out.println(count);
		
	}
}
