class Solution {
    int modulo = (int)1e9+7;
    public int maxArea(int h, int w, int[] horizontal, int[] vertical) {
        Arrays.sort(horizontal);
        Arrays.sort(vertical);
        
        long x = horizontal[0]-0;
        for(int i=1; i<horizontal.length; i++){
            x = Math.max(x, horizontal[i]-horizontal[i-1]);
        }
        x = Math.max(x, h-horizontal[horizontal.length-1]);
        
        long y = vertical[0]-0;
        for(int i=1; i<vertical.length; i++){
            y = Math.max(y, vertical[i]-vertical[i-1]);
        }
        y = Math.max(y, w-vertical[vertical.length-1]);
        
        return (int)(x*y%1000000007);
    }
}