class Solution {
    public int minPartitions(String n) {
        int max = -(int)1e9;
        
        for(int i=0; i<n.length(); i++){
            max = Math.max(max, Integer.parseInt(n.charAt(i)+""));
        }
        return max;
    }
}