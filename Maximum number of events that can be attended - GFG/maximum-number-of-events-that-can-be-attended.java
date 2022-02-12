// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            int[] start = new int[N];
            int[] end = new int[N];
            
            for(int i=0; i<N; i++)
            {
                start[i] = Integer.parseInt(S1[i]);
                end[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxEvents(start,end,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
        ArrayList<pair> list = new ArrayList<>();
        for(int i=0; i<start.length; i++){
            list.add(new pair(start[i],end[i]));
        }
        Collections.sort(list);
        boolean arr[] = new boolean[list.get(N-1).end+1];
        arr[list.get(0).start] = true;
        
        int count=1;
        
        for(int i=1; i<list.size(); i++){
            
            for(int j=list.get(i).start; j<=list.get(i).end; j++){
                if(arr[j]==false){
                    arr[j] = true;
                    count++;
                    break;
                }
            }
        //     if(list.get(i).start > list.get(j).end){
        //         count++;
        //         j=i;
        //     }
         }
        return count;
    }
}
class pair implements Comparable<pair>{
    int start;
    int end;
    
    pair(int s,int e){
        start=s;
        end=e;
    }
    public int compareTo(pair o){
        return this.end-o.end;
    }
}