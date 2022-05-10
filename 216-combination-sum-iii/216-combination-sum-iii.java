class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> matrix = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        if(k>=n)return matrix;
        
        solve(matrix, new ArrayList<>(),1,k,n,0);    
        
        
        for(ArrayList l : set){
            matrix.add(new ArrayList<>(l));
        }
        return matrix;
    }
    void solve(List<List<Integer>> matrix,List<Integer> list,int i,int k,int n,int sum){
         if(sum==n && k==0){
            matrix.add(new ArrayList<>(list));
            return;
        }
        if(i>9||k<0||sum>n)return;
        
        list.add(i);
        solve(matrix,list,i+1,k-1,n,sum+i);
        list.remove(list.size()-1);
        solve(matrix,list,i+1,k,n,sum);        
    }
}