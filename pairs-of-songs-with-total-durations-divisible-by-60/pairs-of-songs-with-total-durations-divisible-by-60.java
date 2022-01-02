class Solution {
    public int numPairsDivisibleBy60(int[] arr){
        int count = 0;
        int dummy[] = new int[61];
        for(int i=0; i<arr.length; i++){
            dummy[arr[i]%60]++;
        }
        int n = dummy[0];
        count += n*(n-1)/2;
        n = dummy[30];
        count += n*(n-1)/2;
      
        for(int i=1; i<30; i++){
            count += dummy[i]*dummy[60-i];
        }
        
        return count;
    }
}