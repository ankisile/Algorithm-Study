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
		int k = sc.nextInt();
		
		
		int count =0;
		
		while(true){
			
			// 나눠지는 수가 될때까지 빼기
			int target = (n/k)*k;
			count += n - target;
			
			n = target;
			// n 이 더이상 나눠질수 없을때 반복문 탈출
			if(n<k)
				break;
			
			// n을 k로 나누기
			count += 1;
			n = n/k;
			
		}
		
		count += n-1;
		System.out.println(count);
	}
	
}
