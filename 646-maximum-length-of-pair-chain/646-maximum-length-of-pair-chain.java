class Solution {
    public int findLongestChain(int[][] A) {
       ArrayList<pair> list = new ArrayList<>();
      for(int i=0; i<A.length; i++){
          int f=A[i][0];
          int s=A[i][1];
          list.add(new pair(f,s));
      }
      Collections.sort(list);
      int count=1;
        int j=0;
      for(int i=1; i<list.size(); i++){
          if(list.get(j).second<list.get(i).first){
              count++;
              j=i;
          }
      }
      return count;
    }
}
class pair implements Comparable<pair>{
    int first;
    int second;

    pair(int f,int s){
        first = f;
        second = s;
    }
    public int compareTo(pair o) {
		return this.second-o.second;
    }
}