class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        int n = arr.length;
        
        ArrayList<pair> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new pair(arr[i][0],arr[i][1]));
        }
        Collections.sort(list);
        int j = 0; int i=1;
        while(i<list.size()){
            if(list.get(j).end>=list.get(i).end){
                list.remove(i);
            }
            else if(list.get(j).start==list.get(i).start){
                if(list.get(j).end<list.get(i).end){
                     list.remove(j);
                }
            }
            else{
                i++;
                j++;
            }
        }
        
        return list.size();
    }
}
class pair implements Comparable<pair>{
    int start;
    int end;
    
    pair(int s,int e){
        start = s;
        end = e;
    }
    public int compareTo(pair o) {
		return this.start-o.start;
    }
    
}