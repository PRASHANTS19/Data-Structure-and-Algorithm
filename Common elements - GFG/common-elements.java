// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        while(i<n1 && j<n2){
            if(A[i]<B[j])i++;
            else if(A[i]>B[j])j++;
            else{
                list.add(A[i]);
                while(i<n1-1 && A[i]==A[i+1])i++;
                while(j<n2-1 && B[j]==B[j+1])j++;
                i++; j++;
            }
            
        }
        i=0; j=0;
        int n4=list.size();
        while(i<n3 && j<n4){
            if(C[i]<list.get(j))i++;
            else if(C[i]>list.get(j))j++;
            else{
                res.add(C[i]);
                while(i<n3-1 && C[i]==C[i+1])i++;
                while(j<n4-1 && list.get(j)==list.get(j+1))j++;
                i++; j++;
            }
        }
        return res;
        
    }
}