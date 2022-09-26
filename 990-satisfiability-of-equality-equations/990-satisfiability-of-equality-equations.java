class Solution {
    public boolean equationsPossible(String[] arr) {
        
        Arrays.sort(arr,(p,q)->q.charAt(1)-p.charAt(1));
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<26; i++){
            adj.add(new ArrayList<>());
        }
        
        for(String s : arr){
            if(s.charAt(1)=='='){
                adj.get(s.charAt(0)-'a').add(s.charAt(3)-'a');
                adj.get(s.charAt(3)-'a').add(s.charAt(0)-'a');
            }
        }
        
        for(String s : arr){
            if(s.charAt(1)=='!'){
                if(solve(s.charAt(0)-'a',s.charAt(3)-'a',adj,new boolean[26]))return false;
            }
        }
        return true;
    }
    boolean solve(int start,int end,ArrayList<ArrayList<Integer>> adj ,boolean visited[]){
        if(start==end)return true;
        
        if(visited[start])return false;
        visited[start] = true;
        
        boolean res = false;
        for(int x : adj.get(start)){
            if(visited[x]==false){
                res = solve(x,end,adj,visited);
                if(res)return res;
            }
        }
        return res;
    }
}