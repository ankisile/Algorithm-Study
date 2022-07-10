/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    
    public static void dfs(int n){
    	
    	visited[n] = true;
    	
    	System.out.print(n + " ");
    	
    	for(int i=0;i<graph.get(n).size();i++){
    		int item = graph.get(n).get(i);
    		
    		if(visited[item]==false){
    			dfs(item);
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

        dfs(1);
	}
}
