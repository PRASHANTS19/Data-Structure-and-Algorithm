class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        if(k==0)return;
        
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int start = n-k;
        for(int i=start; i<n; i++){
            l1.add(arr[i]);
        }
        start = n-k-1;
        int end = n-1;
        while(start>=0){
            arr[end--] = arr[start--];
        }
        start=0;
        for(int x : l1){
            arr[start++] = x;
        }
        
        
    }
}