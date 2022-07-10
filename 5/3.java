/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int[][] graph = new int[1000][1000];
	public static int n;
	public static int m;
	
	public static boolean dfs(int x, int y){
		
		if(x<0||y<0||x>=n||y>=m)
			return false;
		
		if(graph[x][y]==0){
			graph[x][y] = 1;
			dfs(x - 1, y);
	        dfs(x, y - 1);
	        dfs(x + 1, y);
	        dfs(x, y + 1);
	        return true;
		}
		return false;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		 n = sc.nextInt();
		 m = sc.nextInt();
		sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<n;i++){
			String str = sc.nextLine();
			for(int j=0;j<m;j++){
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(dfs(i,j)) count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
