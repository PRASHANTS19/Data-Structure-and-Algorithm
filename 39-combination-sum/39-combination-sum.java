class Solution {
    List<List<Integer>> matrix;
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        matrix = new ArrayList<>();
        int n = arr.length;
        solve(arr,n-1,target,new ArrayList<>());
        return matrix;
    }
    void solve(int arr[],int n, int target,List<Integer> list){
        if(target==0){
            matrix.add(new ArrayList<>(list));
            return;
        }
        if(n<0||target<0)return;
        
        solve(arr,n-1,target,list);
        if(arr[n]<=target){
            list.add(arr[n]);
            solve(arr,n,target-arr[n],list);
            list.remove(list.size()-1);
        }
    }
}