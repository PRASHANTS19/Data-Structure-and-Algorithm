class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean arr[] = new boolean[n+1];
        for(int i=0; i<trust.length; i++){
            arr[trust[i][0]]=true;
        }
        int res = -1;
        for(int i=1; i<=n; i++){
            if(arr[i]==false){
                res = i;
                break;
            }
        }
        if(res==-1)return -1;
        int count = 0;
        for(int i=0; i<trust.length; i++){
            if(trust[i][1]==res)count++;
        }
        if(count==n-1)return res;
        return -1;
    }
}