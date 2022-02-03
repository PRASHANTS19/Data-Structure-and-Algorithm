class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int fact=1;
        while(n>0){
            fact = fact*n;
            n--;
        }
        List<List<Integer>> matrix  = new ArrayList<>();
        for(int i=0; i<fact; i++){
            nextPermutation(nums);
            List<Integer> list = new ArrayList<>();
            add(list,nums);
            matrix.add(new ArrayList<>(list));
        }
        return matrix;
        
    }
    void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            if(arr[i+1]>arr[i]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1)Arrays.sort(arr);
        else{
            for(int i=n-1; i>=0; i--){
                if(arr[i]>arr[pivot]){
                    int x = arr[pivot];
                    arr[pivot] = arr[i];
                    arr[i] = x;
                    break;
                }
            }
        
        int i = pivot+1;
        int j = n-1;
        while(i<j){
            int x = arr[j];
            arr[j] = arr[i];
            arr[i] = x;
            i++; j--;
        }
        }
        
    }
    
    void add(List<Integer> list,int[]nums){
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
    }
    
}