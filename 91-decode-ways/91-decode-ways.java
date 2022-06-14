class Solution {
    int dp[];
    public int numDecodings(String s) {
        if(s.charAt(0)=='0')return 0;
        HashSet<String> set = new HashSet<>();
        for(int i=1; i<=26; i++){
            set.add(Integer.toString(i));
        }
        dp = new int[s.length()];
        Arrays.fill(dp,-1);

        return solve(s,0,set);
    }
    int solve(String s,int start,HashSet<String>set){
        if(start==s.length())return 1;
        if(s.charAt(start)=='0')return 0;
        if(start==s.length()-1)return 1;
        
        if(dp[start]!=-1)return dp[start];
        
        int one = solve(s,start+1,set);
        int two = 0;
        String sub = s.substring(start,start+2);
        if(set.contains(sub)){
            two = solve(s,start+2,set);
        }
        
        return dp[start]=one+two;
        
       
    }
}