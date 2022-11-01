class Solution {
    public int[] findBall(int[][] arr) {
        int n = arr[0].length;
        int ans[] = new int[n];
        
        for(int j=0; j<n; j++){
            ans[j] = solve(0,j,arr);
        }
        return ans;
        
        
    }
    int solve(int i,int j,int arr[][]){
        if(i>=arr.length)return j;
        if(j<0||j>=arr[0].length)return -1;
        
        if(arr[i][j]==1 && j+1<arr[0].length&&arr[i][j+1]==1)
                return solve(i+1,j+1,arr);
        
        if(arr[i][j]==-1 && j-1>=0&&arr[i][j-1]==-1)
                return solve(i+1,j-1,arr);
        
        return -1;
    }
}