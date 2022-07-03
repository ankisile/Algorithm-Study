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
		
		
		for(int i=0;i<plans.length;i++){
			String item = plans[i];
			System.out.println(item);
			if(item.equals("R")){
				y =( y!=5 ? y+1 : 5);
			}
			else if(item.equals("L")){
				y = y==1 ? 1 : y-1; 
			}
			else if(item.equals("D")){
				x = x==5 ? 5 : x+1;	
			}
			else if(item.equals("U")){
				 x= x==1 ? 1 : x-1; 
			}
			
		}
		
		System.out.println(x + " "+y);
	}
}
