class Solution {
    public int minOperations(int[] arr, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum +=arr[i];
            if(map.containsKey(sum)==false)
                map.put(sum,i);
        }
        sum = 0; int pointer = 0; int count = (int)1e9;
        
        if(map.containsKey(x))
            count = Math.min(count,map.get(x)+1);
        
        for(int i=n-1; i>=0; i--){
            sum += arr[i];
            pointer++;
            if(sum==x){
                count = Math.min(count,pointer);
            }
            if(map.containsKey(x-sum)){
                if(map.get(x-sum)<i){
                    count = Math.min(count,pointer+map.get(x-sum)+1);
                }
            }
        }
        return count==(int)1e9?-1:count;
    }
}