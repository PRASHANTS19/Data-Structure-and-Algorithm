class Solution {
    public List<Integer> goodIndices(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        int n = arr.length;
        int dec[] = new int[n];
        int inc[]= new int[n];
        
        
        int len=0;
        int min=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<=min)len++;
            else len=1;
            
            dec[i] = len;
            min = arr[i];
        }
        len=0;
        min = arr[n-1];
        for(int i=n-1; i>=0; i--){
            if(arr[i]<=min)len++;
            else len=1;
            
            inc[i]=len;
            min = arr[i];
        }
        
        for(int i=k; i<n-k; i++){
            if(dec[i-1]>=k && inc[i+1]>=k)list.add(i);
        }
        
        // for(int i : dec){
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        // for(int i : inc){
        //     System.out.print(i + " ");
        // }
        return list;
        
        
        
        
    }
}