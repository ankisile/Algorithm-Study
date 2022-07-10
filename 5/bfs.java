/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	public static ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>();
	public static boolean visited [] =new boolean[9];

	public static void bfs(int n){
		Queue<Integer> q = new LinkedList<>();
		visited[n] = true;
		q.offer(n);

		while(!q.isEmpty()){
			int item = q.poll();
			System.out.print(item+" ");
			for(int i=0;i<graph.get(item).size();i++){
				int t = graph.get(item).get(i);
				if(!visited[t]){
					q.offer(t);
					visited[t]=true;
				}
			}
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        
        graph.get(2).add(1);
        graph.get(2).add(7);
        
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        
        graph.get(4).add(3);
        graph.get(4).add(5);
        
        graph.get(5).add(3);
        graph.get(5).add(4);
        
        graph.get(6).add(7);
        
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);
        
        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);
	}
}
