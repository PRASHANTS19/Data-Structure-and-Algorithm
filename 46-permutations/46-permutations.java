class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();
        int n = nums.length;
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        boolean check[] = new boolean[nums.length];
        solve(nums,n-1,matrix,list,check);
        return matrix;
       
    }
    void solve(int[] arr,int n,List<List<Integer>> matrix,List<Integer>list,boolean check[]){
        // if(n<0)return;
        if(list.size()==arr.length){
            matrix.add(new ArrayList<>(list));
            return;
        }
        for(int i=0; i<arr.length; i=i+1){
            if(check[i]==false){
                check[i] = true;
                list.add(arr[i]);
                solve(arr,i,matrix,list,check);
                check[i]=false;
                list.remove(list.size()-1);
            }
            else continue;
        }   
    }  
}