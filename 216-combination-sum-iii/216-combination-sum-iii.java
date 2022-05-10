class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> matrix = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        
        for(int i=1; i<=9; i++){
            solve(set, new ArrayList<>(),i,k,n,0);    
        }
        
        for(ArrayList l : set){
            matrix.add(new ArrayList<>(l));
        }
        return matrix;
    }
    void solve(HashSet<ArrayList<Integer>> set,List<Integer> list,int i,int k,int n,int sum){
         if(sum==n && k==0){
            set.add(new ArrayList<>(list));
            return;
        }
        if(i>9||k<0||sum>n)return;
        
        list.add(i);
        solve(set,list,i+1,k-1,n,sum+i);
        list.remove(list.size()-1);
        solve(set,list,i+1,k,n,sum);        
    }
}