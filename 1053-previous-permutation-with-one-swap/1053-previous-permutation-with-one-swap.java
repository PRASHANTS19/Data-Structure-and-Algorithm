class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int j=n-1;
        int i=n-2;
        
        while(i>=0){
            if(arr[i]<=arr[i+1])i--;
            else break;
        }
        if(i==-1)return arr;
        while(j>=0){
            if(arr[j]>=arr[i] || (j>=0 && arr[j]==arr[j-1]))j--;
            else break;
        }
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}



