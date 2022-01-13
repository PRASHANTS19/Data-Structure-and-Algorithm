class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> matrix = new ArrayList<>();
        solve(nums,new ArrayList<>(),0,matrix );
        return matrix;
        
    }
    void solve(int[] arr,List<Integer>list,int i,List<List<Integer>>matrix){
        if(i==arr.length){
            matrix.add(new ArrayList<>(list));
            // list.clear();
            return;
        }
        list.add(arr[i]);
        solve(arr,list,i+1,matrix);
        list.remove(list.size()-1);
        solve(arr,list,i+1,matrix);
    }
}