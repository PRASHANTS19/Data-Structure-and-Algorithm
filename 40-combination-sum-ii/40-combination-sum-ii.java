class Solution {
    List<List<Integer>> matrix;
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        matrix = new ArrayList<>();
        
        Arrays.sort(arr);
        // HashSet<Integer> set = new HashSet<>();
        solve(arr,0,0,target,new ArrayList<>());
        return matrix;
        
    }
    void solve(int arr[],int i,int sum,int target,List<Integer>list){
        if(target==sum){
            matrix.add(new ArrayList<>(list));
            return;
        }
        if(i>=arr.length)return;
        if(sum>target)return;
        
        for(int j=i; j<arr.length; j++){
            if(j!=0 && j>i && arr[j]==arr[j-1])continue;
            
                list.add(arr[j]);
                solve(arr,j+1,sum+arr[j],target,list);
                list.remove(list.size()-1);
        
             // solve(arr,j+1,sum,target,list);
        
        }
        
        
    }
}