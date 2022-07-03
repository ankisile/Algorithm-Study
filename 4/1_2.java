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
		sc.nextLine(); //버퍼 지우기
		String[] plans = sc.nextLine().split(" ");
		
		int x = 1;
		int y = 1;
		
		int lr[] = {-1,0,+1,0};
		int ud[] = {0,1,0,-1};
		char move[] = {'L','D','R','U'};
		
		for(int i=0;i<plans.length;i++){
			
			char plan = plans[i].charAt(0);
			
			int nx =0 , ny = 0;
			
			for(int j=0;j<4;j++){
				if(move[j] == plan){
					nx = x+ud[j];
					ny = y +lr[j];
				}
				
			}
			
			if(nx ==0 || nx>n ||ny == 0||ny>n)
				continue;
			
			x = nx;
			y = ny;
			
		}
		
		System.out.println(x + " "+y);
	}
}
