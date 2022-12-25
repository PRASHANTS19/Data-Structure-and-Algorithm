class Solution {
    public int[] answerQueries(int[] nums, int[] q) {
        
        Arrays.sort(nums);
        int n = q.length;
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<nums.length; j++){
                sum += nums[j];
                if(sum<=q[i]){
                    arr[i] = j+1;
                }
                else break;
            }
        }
        return arr;
    }
}