// { Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	   ArrayList<Integer> left = new ArrayList<>();
	    Stack<Integer>right = new Stack<>();
	   ArrayList<Integer> bottom = new ArrayList<>();
	  
	   left.add(node.data);  
	   
	   leftTree(node.left,left);
	   bottomTree(node.left,bottom);
	   bottomTree(node.right,bottom);
	   rightTree(node.right,right);
	   
	   ArrayList<Integer> res = new ArrayList<>();
	   
	   for(int x : left)res.add(x);
	   for(int x : bottom)res.add(x);
	   
	   while(right.isEmpty()!=true)
	        res.add(right.pop());
	   
	   return res;
	   
	}
	void bottomTree(Node root,ArrayList<Integer> bottom){
	    if(root==null)return;
	    
	    if(root.left==null && root.right==null)bottom.add(root.data);
	    
	    bottomTree(root.left,bottom);
	    bottomTree(root.right,bottom);
	}
	
	void rightTree(Node root,Stack<Integer> right){
	    if(root==null)return;
	    if(root.left==null && root.right==null)return;
	    
	    right.push(root.data);
        if(root.right!=null)
	        rightTree(root.right,right);
	   else
	        rightTree(root.left,right);
	}
	
	void leftTree(Node root,ArrayList<Integer> left){
	    if(root==null)return;
	    if(root.left==null && root.right==null)return;
	    
	    left.add(root.data);
	    if(root.left!=null)
	        leftTree(root.left,left);
	   else
	        leftTree(root.right,left);
	}
}
