class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        
        return solve(arr, target, 0, 0);
    }
    int solve(int arr[], int target, int i, int sum){
        if(i>=arr.length){
            if(sum==target)return 1;
            else return 0;
        }
        
        int plus = solve(arr, target, i+1, sum+arr[i]);
        int minus = solve(arr, target, i+1, sum-arr[i]);
        
        return plus+minus; 
    }
}