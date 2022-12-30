class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] adj) {
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(adj,0,ans,new ArrayList<>());
        
        return ans;
    }
    void solve(int adj[][],int start,List<List<Integer>> ans,List<Integer>list){
        if(start==adj.length-1){
            list.add(start);
            ans.add(new ArrayList<>(list));
            // System.out.print("xx");
            list.remove(list.size()-1);
            return;
        }
        
        list.add(start);
        // System.out
        for(int i : adj[start]){
            solve(adj,i,ans,list);
        }
        list.remove(list.size()-1);
    }
}