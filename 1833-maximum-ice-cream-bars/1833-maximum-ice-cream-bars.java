class Solution {
    public int maxIceCream(int[] arr, int coins) {
        
        Arrays.sort(arr);
        int count=0;
        int i=0;
        while(i<arr.length && coins>0){
            if(arr[i]>coins)break;
            
            coins -= arr[i++];
            count++;
        }
        return count;
        
    }
}