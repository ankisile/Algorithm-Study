// 내가 그냥 풀었을때
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
		
		
		int arr [][] =new int [n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++){
			Arrays.sort(arr[i]); // 입력 받은 수들 정렬하기
			if(arr[i][0]>max)
				max=arr[i][0];
			
		}

		System.out.println(max);

	}
	
}
