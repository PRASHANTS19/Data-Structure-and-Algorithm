class Solution {
    public int findMinArrowShots(int[][] points) {
        ArrayList<pair> list = new ArrayList<>();
        Arrays.sort(points, (int[] p1, int[] p2)->{
		    // Don't use p1[1 ] - p2[1]. It may overflow 
            return p1[1] < p2[1] ? -1 : 1; 
        });
        for(int i=0; i<points.length; i++){
            list.add(new pair(points[i][0],points[i][1]));
        }
        //Collections.sort(list);
        int count = 1;
        int j = 0;
        for(int i=1; i<list.size(); i++){
            if(list.get(j).end>=list.get(i).start){
                continue;
            }
            else{
                count++;
                j=i;
            }
        }
        return count;
        
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
		return this.end-o.end;
    }
}