class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        //delay for count
        int mod = (int)1e9+7;
        ArrayList<int[]>list = new ArrayList<>();
        list.add(new int[]{1+delay,1+forget,1});
        int days=2;
        
        while(days<=n){
            int count =0;
            for(int i=0; i<list.size(); i++){
                if(list.get(i)[1]==days){
                    list.remove(i);
                }
            }
            for(int[]temp : list){
                if(temp[0]<=days){
                    count+=temp[2];
                }
                count %=mod;
            }
            list.add(new int[]{days+delay,days+forget,count});
            days++;
        }
        int ans = 0;
        for(int[] temp:list){
            ans += temp[2];
            ans %=mod;
        }
        return ans;
    }
}