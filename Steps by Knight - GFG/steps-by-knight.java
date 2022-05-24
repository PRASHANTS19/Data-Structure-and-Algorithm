// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int kp[], int tp[], int N)
    {
        int dir[][]={{1,2},{-1,2},{1,-2},{-1,-2},{2,1},{2,-1},{-2,1},{-2,-1}};
        
        boolean visited[][] = new boolean[N+1][N+1];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{kp[0],kp[1]});
        visited[kp[0]][kp[1]]=true;
        
        int steps = 0;
        
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int i=0; i<size; i++){
                int temp[] = q.remove();
                int x = temp[0];
                int y = temp[1];
                
                if(x==tp[0] && y==tp[1])return steps;
                
                for(int j=0; j<8; j++){
                    int nextx = x+dir[j][0];
                    int nexty = y+dir[j][1];
                    
                    if(nextx>N||nextx<0||nexty>N||nexty<0|| visited[nextx][nexty]==true)continue;
                    else{
                        visited[nextx][nexty]=true;
                        q.add(new int[]{nextx,nexty});
                    }
                }
            }
            steps++;
        }
        
        return -1;
    }
}