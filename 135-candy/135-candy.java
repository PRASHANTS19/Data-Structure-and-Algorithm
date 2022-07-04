class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        if(n==1)return 1;
        int candy[] = new int[n];
        Arrays.fill(candy,1);
        
        if(arr[0]>arr[0+1])candy[0]=2;
        
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                candy[i]=candy[i-1]+1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(arr[i]>arr[i+1]){
                if(candy[i]<=candy[i+1])
                    candy[i]=candy[i+1]+1;
            }
        }
        
        int total=0;
        for(int i:candy)
            total+= i;
    
        return total;
    }
}