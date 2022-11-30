class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        
        Arrays.sort(arr);
        int count = 1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                if(set.add(count)==false)return false;
                count = 1;
            }
        }
        return set.add(count);
    }
}