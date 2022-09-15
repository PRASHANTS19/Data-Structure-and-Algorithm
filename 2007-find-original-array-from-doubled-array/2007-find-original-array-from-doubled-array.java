class Solution {
    public int[] findOriginalArray(int[] arr) {
        int n = arr.length;
        if(n%2!=0)return new int[]{};
        HashMap<Integer,Integer> map = new HashMap<>();
        
        Arrays.sort(arr);
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int res[] = new int[n/2];
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(map.getOrDefault(arr[i],0)>0){
                if(map.getOrDefault(arr[i]*2,0)>0){
                    res[k++]=arr[i];
                    map.put(arr[i]*2,map.get(arr[i]*2)-1);
                    map.put(arr[i],map.get(arr[i])-1);
                }  
                else return new int[]{};
            }
        }
        return res;
    }
}