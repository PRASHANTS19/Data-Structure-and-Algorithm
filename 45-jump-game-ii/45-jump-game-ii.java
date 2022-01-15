class Solution {
    public int jump(int[] arr) {
        int n = arr.length;
        int maxreach = 0;
        int curreach = 0;
        int jump = 0;
        for(int i=0; i<n-1; i++ ){
            maxreach = Math.max(maxreach , arr[i]+i);
            if(i==curreach){
                jump++;
                curreach = maxreach;
            }
            
        }
        return jump;
    }
}