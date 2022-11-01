class Solution {
    int mod= (int)1e9+7;
    public int countNicePairs(int[] arr) {
        HashMap<Integer,Long> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int r = rev(arr[i]);
            int n = arr[i]-r;
            map.put(n,(map.getOrDefault(n,0L)+1L)%mod);
        }
        int ans = 0;
        
        for(Map.Entry<Integer,Long> entry:map.entrySet()){
            ans += (count(entry.getValue())%mod);
        }
        return ans%mod;
        
        
    }
    long count(long n){
        return (n*(n-1))/2;
    }
    int rev(int num) {
		int ans = 0;
		while(num>0) {
			ans = ans*10+num%10;
			num/=10;
		}
		return ans;
	}
}