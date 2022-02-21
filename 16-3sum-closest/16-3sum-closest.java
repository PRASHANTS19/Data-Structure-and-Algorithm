class Solution {
    public int threeSumClosest(int[] arr, int t) {
        int n = arr.length;
        int diff = Integer.MAX_VALUE;
        int min = 0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int j=i+1; int k=n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                int d = Math.abs(sum-t);
                if(d<diff){
                    diff = d;
                    min = sum;
                }
                if(sum>t)k--;
                else if(sum<t)j++;
                else{
                    return sum;
                }
                
            }
          
        }
        return min;
    }
}