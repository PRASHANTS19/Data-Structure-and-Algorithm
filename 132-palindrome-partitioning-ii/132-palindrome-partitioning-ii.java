class Solution {
    private Integer dp[][];
    private Boolean dpIsPalindrome[][];
    public int minCut(String s) {
        dp = new Integer[s.length()][s.length()];
        dpIsPalindrome = new Boolean[s.length()][s.length()];
        return minCutFrom(s, 0, s.length() - 1);
    }
    
    private int minCutFrom(String s, int start, int end) {
        if (start == end || isPalindrome(s, start, end)) {
            return 0;
        }
        
        if (dp[start][end] != null)
            return dp[start][end];
        
        int minCut = s.length() - 1;
        for (int i = start; i <= end; i++) {
            if (isPalindrome(s, start, i)) {
                minCut = Math.min(minCut, 1 + minCutFrom(s, i + 1, end));
            }
        }
        return dp[start][end] = minCut;
    }
    
    private boolean isPalindrome(String s, int start, int end) {
        if (start >= end)
            return true;
        
        if (dpIsPalindrome[start][end] != null)
            return dpIsPalindrome[start][end];
        
        return dpIsPalindrome[start][end] = (s.charAt(start) == s.charAt(end))
            && isPalindrome(s, start + 1, end - 1);
    }
}