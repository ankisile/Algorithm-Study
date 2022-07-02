/* package whatever; // don't place package name! */
//그냥 풀었을때

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
		
		int max=0, nextMax=0;
		int sum =0;
		
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int arr [] =new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>=max) {
				nextMax = max;
				max = arr[i];
				
			}
		}
		
		System.out.println(max);
		System.out.println(nextMax);
		
		if(max == nextMax) {
			sum += max*m;				
		}
		else {
			int quota = m/k;
			int remain = m%k;
			sum+=max*k*quota;
			sum+=nextMax*remain;
		}
		
		System.out.println(sum);

	}
	
}
