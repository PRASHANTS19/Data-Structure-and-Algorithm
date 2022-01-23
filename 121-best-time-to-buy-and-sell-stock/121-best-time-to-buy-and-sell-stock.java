class Solution {
    public int maxProfit(int[] arr) {
        
        int buy = arr[0];
        int profit = 0;
        int maxprofit=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<buy){
                buy = arr[i];
            }
            profit = Math.max(profit,arr[i]-buy);
            maxprofit = Math.max(profit,maxprofit);
        }
        return profit;
       
    }
}