class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        if(n==1){
            if(arr[0]==1)return 1;
            else return 0;
        }
        int count =0;
        int max = 0;
        
        for(int i=0; i<n; i++){
           if(arr[i]==1)count++;
            else count = 0;
            max = Math.max(count,max);
        }
        max = Math.max(count,max);
        return max;
    }
}