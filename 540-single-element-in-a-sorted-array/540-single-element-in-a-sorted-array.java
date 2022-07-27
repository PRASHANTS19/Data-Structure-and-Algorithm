class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n= arr.length;
        int i=0,j=n-1;
        
        while(i<j){
            int mid = i+(j-i)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1])i=mid+1;
                else j=mid;
            }
            else if(mid%2!=0){
                if(arr[mid]==arr[mid-1])i=mid+1;
                else j=mid;
            }   
        }
        return arr[i];
    }
}