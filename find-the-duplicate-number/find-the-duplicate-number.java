class Solution {
    public int findDuplicate(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            if(set.add(arr[i]) == false){
                return arr[i];
            }  
            else{
                set.add(arr[i]);
            }
        }
            return 0;
    }
}