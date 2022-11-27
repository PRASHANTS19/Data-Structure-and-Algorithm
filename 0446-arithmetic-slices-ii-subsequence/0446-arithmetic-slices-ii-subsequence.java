class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        int n = arr.length;
        
        HashMap<Integer,Integer>map[] = new HashMap[n];
        for(int i=0; i<n; i++){
            map[i] = new HashMap<>();
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                long cd = (long)arr[i]-(long)arr[j];
                if(cd<=Integer.MIN_VALUE || cd>=Integer.MAX_VALUE)
                    continue;
                
                int endAtj = map[j].getOrDefault((int)cd,0);
                int endAti = map[i].getOrDefault((int)cd,0);
                ans += endAtj;
                map[i].put((int)cd,endAti+endAtj+1);
            }
        }
        return ans;
    }
}