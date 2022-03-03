class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
          int n = arr.length;
        if(n==1 || n==2)return 0;
        int start=0,end=0,count=0;
        int diff = arr[0]-arr[1];
        
        while(end<n){
            if(end==n-1){
                if(end-start>=2){
                    count+= ncr(start,end);
                }
                end++;
            }
           else if(arr[end]-arr[end+1]==diff){
                end++;
                continue;
            }
            else{
                if(end-start>=2){
                    count+= ncr(start,end);
                }
                diff = arr[end]-arr[end+1];
                start = end;
                end++;
            }
        }
        return count;
        
        
    }
    int ncr(int start,int end){
        int n = end-start-1;
        return n*(n+1)/2;
    }
}