class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        for(int i=0; i<n; i++){
            int x=prefix[i]%k;
            
            if(x<0)x+=k;
            
            count += map.getOrDefault(x,0);
            
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return count;
    }
}