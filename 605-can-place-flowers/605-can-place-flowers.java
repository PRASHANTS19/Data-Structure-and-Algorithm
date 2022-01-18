class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(arr.length==1){
            if(arr[0]==0 && n==1)return true;
            else if(n==0)return true;
            return false;
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(i==0){
                if(arr[i]==0 && arr[i+1]==0){
                    arr[i]=1;
                    count++;
                }
            }
            else if(i==arr.length-1){
                if(arr[i]==0 && arr[i-1]==0){
                    count++;
                }
            }
            else{
                if(arr[i]==0 && arr[i+1]==0 && arr[i-1]==0){
                arr[i]=1;
                count++;
                }
            }
        }
        //System.out.print(count);
        if(count>=n)return true;
        return false;
    }
}