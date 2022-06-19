class Solution {
    List<List<Integer>>matrix;
    public List<List<Integer>> permute(int[] arr) {
        matrix = new ArrayList<>();
        int n = arr.length;
        boolean select[] = new boolean[n];
        solve(n-1,arr,select,new ArrayList<>());
        
        return matrix;
    }
    void solve(int n,int arr[],boolean[] select,List<Integer>list){
        
        if(list.size()==arr.length || n<0){
            matrix.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=arr.length-1; i>=0; i--){
            if(select[i]==false){
                select[i]=true;
                list.add(arr[i]);
                solve(n-1,arr,select,list);
                list.remove(list.size()-1);
                select[i]=false;
            }
        }
    }
}