class Solution {
    public int minimumAverageDifference(int[] arr) {
        int n = arr.length;
        long pre[] = new long[n];
        long post[] = new long[n];
        
        pre[0] = arr[0];
        post[n-1] = arr[n-1];
        
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1]+arr[i];
        }
        for(int i=n-2; i>=0; i--){
            post[i]= post[i+1]+arr[i];
        }
        
        long min = Long.MAX_VALUE;
        int index = -1;
        for(int i=0; i<n-1; i++){
            long temp = Math.abs((pre[i]/(i+1))-(post[i+1]/(n-i-1)));
            if(temp<min){
                // System.out.print(temp + "   ");
                min = temp;
                index= i;
            }
        }
        long temp = post[0]/n;
        if(temp<min){
                min = temp;
                index= n-1;
        }
        
        return index;
    }
}