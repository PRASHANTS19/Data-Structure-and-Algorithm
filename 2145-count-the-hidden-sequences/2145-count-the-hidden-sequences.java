class Solution {
    public int numberOfArrays(int[] diff, int lower, int upper) {
        long x = 0;
        long min = 0;
        long max = 0;
        int n = diff.length;
        for(int i : diff){
            x += i;
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        return (int)Math.max(0, (upper - lower) - (max - min) + 1);
    }
}