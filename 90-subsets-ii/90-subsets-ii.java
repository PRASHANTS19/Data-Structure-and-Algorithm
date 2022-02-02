class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,list,matrix,false);
        return matrix;
    }
    void solve(int[] arr,int i,List<Integer>list,List<List<Integer>> matrix,boolean cflag){
        if(i==arr.length){
            matrix.add(new ArrayList<>(list));
            return;
        }
        else{
           
            solve(arr,i+1,list,matrix,false);
            if(i>0 && arr[i]==arr[i-1] && !cflag)return;
            list.add(arr[i]);
            solve(arr,i+1,list,matrix,true);
            list.remove(list.size()-1);
        }
        
    }
}