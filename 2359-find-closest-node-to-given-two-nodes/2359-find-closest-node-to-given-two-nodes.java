class Solution {
    public int closestMeetingNode(int[] arr, int n1, int n2) {
        
        int n = arr.length;
        int ans1[] = new int[n];
        int ans2[] = new int[n];
        
        Arrays.fill(ans1,(int)1e9);
        Arrays.fill(ans2,(int)1e9);
        
        solve(arr,new boolean[n],n1,ans1,0);
        solve(arr,new boolean[n],n2,ans2,0);
        
        int ans = -1;
        int count = (int)1e9;
        
        for(int i=0; i<n; i++){
            // System.out.println(ans1[i] + " " + ans2[i] + " ");
            if(ans1[i]!=(int)1e9 && ans2[i]!=(int)1e9){
                if(Math.max(ans1[i],ans2[i])<count){
                    count = Math.max(ans1[i],ans2[i]);
                    ans = i;
                }
            }
        }
        return ans;
    }
    void solve(int arr[],boolean visited[],int start,int ans[],int count){
         if(visited[start] )return;
        if(arr[start]==-1){
            ans[start] = count;
            return;
        }
        ans[start] = count;
        
        visited[start] = true;
        
        solve(arr,visited,arr[start],ans,count+1);
    }
}