class Solution {
    public int maxArea(int[] arr) {
        int i=0,j=arr.length-1;
        
        int water=0;
        while(i<j){
            water = Math.max(water,(j-i)*Math.min(arr[i],arr[j]));
            if(arr[i]<arr[j])i++;
            else j--;
        }
       return water;
    }
}