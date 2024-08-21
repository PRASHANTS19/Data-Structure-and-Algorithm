class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        NavigableMap<Integer, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        int ans[] = new int[n - k + 1];
        int x = 0;
        
        ans[x++] = map.lastKey();
        
        for(int i = k; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            map.put(arr[i - k], map.get(arr[i - k]) - 1);
            
            if(map.get(arr[i - k]) == 0) {
                map.remove(arr[i - k]);
            }
            
            ans[x++] = map.lastKey();
        }
        
        return ans;
    }
}
