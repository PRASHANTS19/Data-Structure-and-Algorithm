// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class pair implements Comparable<pair>{
    int start;
    int end;
    pair(int s , int e){
        start = s;
        end = e;
    }
    public int compareTo(pair o) {
		return this.end-o.end;
    }
    
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int st[], int en[], int n)
    {
        ArrayList<pair> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new pair(st[i],en[i]));
        }
        Collections.sort(list);
        int j=0; int count = 1;
        
        for(int i=1; i<list.size(); i++){
            if(list.get(i).start>list.get(j).end){
                count++;
                j=i;
            }
        }
        return count;
        
    }
}
