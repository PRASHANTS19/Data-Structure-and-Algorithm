class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int n = nums.size();
        List<int[]> list = new ArrayList<>();
         for(int i=0; i<n; i++){
             for(int j: nums.get(i)){
                 list.add(new int[]{j,i});
             }
         }
        Collections.sort(list, (p,q)->p[0]-q[0]);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int ans[] = {0, (int)1e6};
        
        for(int i=0,j=0; i<list.size(); i++){
            map.put(list.get(i)[1], map.getOrDefault(list.get(i)[1],0)+1);
            
            if(map.size()==n){
                while(map.size()==n){
                    map.put(list.get(j)[1], map.get(list.get(j)[1])-1);
                    if(map.get(list.get(j)[1])==0)map.remove(list.get(j)[1]);
                    j++;
                }
                j--;
                map.put(list.get(j)[1], map.getOrDefault(list.get(j)[1],0)+1);
                if(ans[1]-ans[0]>list.get(i)[0]-list.get(j)[0]){
                    ans[0] = list.get(j)[0];
                    ans[1] = list.get(i)[0];
                }
            }
            
        }
        return ans;
    }
}