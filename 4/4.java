/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int arr [][] = new int [50][50];
	static int d[][] = new int [50][50];
	static int direction;
	
	
	public static void turn_left(){
		
		direction -=1;
		if(direction ==-1) direction =3;
		
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int dx[]={-1,0,1,0};
		int dy[]={0,1,0,-1};
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		direction = sc.nextInt();
		
		d[x][y] =1;
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int count=1;
        int turn =0;
        
        while(true){
        	
        	turn_left();
        	turn++;
        	int nx =0, ny=0;
        	nx = x+dx[direction];
        	ny = y+dy[direction];
        	
        	if(d[nx][ny]==0 && arr[nx][ny]==0){
        		d[nx][ny]=1;
        		x=nx;y=ny;
        		count++;
        		turn = 0;
        		continue;
        	}
        	if(turn == 4 ){
        		nx = x - dx[direction];
        		ny = y -dy[direction];
        		turn =0;
        		if(arr[nx][ny]==1){
        			break;
        		}
        		else{
        			x=nx;
        			y=ny;
        		}
        	}
        	
        }
        
        System.out.println(count);
	}
}
