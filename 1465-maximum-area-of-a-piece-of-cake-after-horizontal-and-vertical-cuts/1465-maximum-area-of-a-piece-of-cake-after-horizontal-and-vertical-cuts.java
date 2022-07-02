class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
    Arrays.sort(verticalCuts);
    
    long maxWidth = horizontalCuts[0] - 0;
    long maxHeight = verticalCuts[0] - 0;
    
    for(int i = 1 ; i < horizontalCuts.length ; i++) {
        maxWidth = Math.max(maxWidth,horizontalCuts[i]-horizontalCuts[i-1]);
    }
    
    for(int i = 1 ; i < verticalCuts.length ; i++) {
        maxHeight = Math.max(maxHeight,verticalCuts[i]-verticalCuts[i-1]);
    }
    
    maxWidth = Math.max(maxWidth,h-horizontalCuts[horizontalCuts.length-1]);
    maxHeight = Math.max(maxHeight,w-verticalCuts[verticalCuts.length-1]);
    
    return (int) (maxWidth * maxHeight % 1000000007);
    }
}