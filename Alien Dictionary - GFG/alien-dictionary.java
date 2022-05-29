// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int k)
    {
        // Write your code here
        //topological sort
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<k; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0; i<dict.length-1; i++){
            String w1 = dict[i];
            String w2 = dict[i+1];
            for(int j=0; j<Math.min(w1.length(),w2.length()); j++){
                if(w1.charAt(j)!=w2.charAt(j)){
                    adj.get(w1.charAt(j)-'a').add(w2.charAt(j)-'a');
                    break;
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[k];
        for(int i=0; i<k; i++){
            if(visited[i]==false)
                dfs(adj,visited,i,stack);
        }
        StringBuilder res = new StringBuilder();
        while(stack.isEmpty()!=true){
            res.append((char)(stack.pop()+'a'));
        }
        return res.toString();
    }
    void dfs( ArrayList<ArrayList<Integer>> adj,boolean visited[],int start,Stack<Integer> stack){
        visited[start]=true;
        
        for(int x : adj.get(start)){
            if(visited[x]==false){
                dfs(adj,visited,x,stack);
            }
        }
        stack.push(start);
    }
}