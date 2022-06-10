class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit =0;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]<buy)
                buy = arr[i];
            else if(arr[i]>buy){
                profit += arr[i]-buy;
                buy = arr[i];
            }
        }
        return profit;
    }
}