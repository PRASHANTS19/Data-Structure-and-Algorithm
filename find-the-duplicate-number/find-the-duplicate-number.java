class Solution {
    public int findDuplicate(int[] arr) {
        
        int slow = arr[0];
        int fast = arr[arr[0]];
        
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        fast = 0;
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}