class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int indegree[] = new int[n+1];
        int outgoing[] = new int[n+1];
        
        for(int i=0; i<trust.length; i++){
            outgoing[trust[i][0]]++;
            indegree[trust[i][1]]++;
        }
        for(int i=1; i<=n; i++){
            if(outgoing[i]==0 && indegree[i]==n-1)return i;
        }
        return -1;
    }
}