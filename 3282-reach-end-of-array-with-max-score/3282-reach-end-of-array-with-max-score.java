class Solution {
    public long findMaximumScore(List<Integer>list) {
        int n = list.size();
        int j=0;
        long sum = 0;
        for(int i=1; i<n; i++){
            if(list.get(i)>list.get(j)){
                sum += (long)(i-j)*(long)list.get(j);
                j = i;
            }
        }
        if(j<n-1){
            sum += (long)(n-1-j)*(long)list.get(j);
        }
        return sum;
    }
}