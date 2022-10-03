class Solution {
    public int minCost(String str, int[] arr) {
     int remove=0;
        int n = str.length();
        for(int i=0; i<n-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                int sum = 0;
                int max = 0;
                
                while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                    sum += arr[i];
                    max = Math.max(arr[i],max);
                    i++;
                }
                sum += arr[i];
                 max = Math.max(arr[i],max);
                // System.out.print(i);
                // System.out.print(sum);
                // System.out.print(max);
                sum -= max;
                remove += sum;
                
            }
        }
        return remove;
        
    }
}