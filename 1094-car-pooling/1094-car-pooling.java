class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
       int arr[] = new int[1001];
        for(int i=0; i<trips.length; i++){
           arr[trips[i][1]] += trips[i][0];
            arr[trips[i][2]] += -trips[i][0];
        }
        
        int v = 0;
        for(int i=0; i<arr.length; i++){
            v += arr[i];
            if(v>capacity)return false;
        }
        return true;
     }
}
class pair implements Comparable<pair>{
    int value;
    int start;
    int end;
    pair(int v , int s){
        value = v;
        start = s;
    }
    
    @Override
	public int compareTo(pair o) {
		return this.start-o.start;
	}
}
