class Solution {
    // int count = 0;
    public boolean makesquare(int[] arr) {
       
        int target = 0;
        for(int x : arr){
            target += x;
        }
        Arrays.sort(arr);
        reverse(arr);
        if(target%4!=0)return false;
        target = target/4;
       return solve(arr,new int[4],target,0);
     }
    boolean solve(int arr[],int res[],int target,int index){
        if(index==arr.length){
            if(res[0]==target&&res[1]==target&&res[2]==target&&res[3]==target)
                return true;
            else return false;
        }
        
        for(int i=0; i<4; i++ ){
            if(res[i]+arr[index]>target)continue;
            res[i] += arr[index];
            if(solve(arr,res,target,index+1))return true;
            res[i] -= arr[index];
        }
        return false;
    }
     private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}