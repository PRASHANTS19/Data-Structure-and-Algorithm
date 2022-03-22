class Solution {
    public String getSmallestString(int n, int k) {
        int arr[] = new int[n];
        Arrays.fill(arr,1);
        
        k = k-n;
        int j = n-1;
        while(k>0){
            arr[j] += Math.min(k,25);
            k -= Math.min(k,25);
            j--;
        }
        
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++){
            res.append((char)(arr[i]+'a'-1));
        }
        return res.toString();
    }
}