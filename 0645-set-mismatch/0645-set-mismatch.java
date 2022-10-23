class Solution {
    public int[] findErrorNums(int[] arr) {
        
      HashSet<Integer>set = new HashSet<>();
      int n = arr.length;
      int r=0;int m=0;
      long sum = 0;
      for(int i : arr){
        if(set.contains(i))r=i;
        
        set.add(i);
        sum += i;
      }
      sum -= r;
      m = ((n*(n+1))/2)-(int)sum;
      
      return new int[]{r,m};
      
      
      
      
    }
}