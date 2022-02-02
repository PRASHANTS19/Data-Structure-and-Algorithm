class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>>matrix = new ArrayList<>();
        Arrays.sort(arr);
        solve(arr,0,0,target,new ArrayList<>(),matrix);
        return matrix;
        
    }
    void solve(int arr[],int i,int sum,int target,List<Integer> list,List<List<Integer>>matrix){
        if(sum==target){
            matrix.add(new ArrayList<>(list));
            return;
        }
        if(sum<0 || i==arr.length)return;
        if(sum<=target){
            list.add(arr[i]);
            solve(arr,i,sum+arr[i],target,list,matrix);
            list.remove(list.size()-1);
            solve(arr,i+1,sum,target,list,matrix);
            
        }
    }
}