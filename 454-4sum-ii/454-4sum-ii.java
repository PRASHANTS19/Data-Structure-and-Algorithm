class Solution {
    public int fourSumCount(int[] a1, int[] a2, int[] a3, int[] a4) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = a1.length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int sum = a1[i]+a2[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int sum = a3[i]+a4[j];
                if(map.containsKey(-sum)){
                    count += map.get(-sum);
                }
            }
        }
        return count;
    }
}