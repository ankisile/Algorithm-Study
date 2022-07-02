/* package whatever; // don't place package name! */
// 내가 그냥 풀었을때

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
		
		int sum =0;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int arr [] =new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 입력 받은 수들 정렬하기
		
		int first = arr[n-1];
		int second = arr[n-2];
		
		System.out.println(first + " "+second);
		
		// m이 k로 나누어 떨어지는 경우도 있기 때문에 반복되는 경우로 생각해야함
		sum = sum+ first*(k*(m/(k+1))+m%(k+1));
		sum+= second*(m/(k+1));
		
		
		System.out.println(sum);

	}
	
}
