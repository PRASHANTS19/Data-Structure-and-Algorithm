class Solution {
    public int[][] kClosest(int[][] arr, int k) {
        
        ArrayList<pair> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int n = (int)Math.pow(arr[i][0],2) + (int)Math.pow(arr[i][1],2);
            list.add(new pair(Math.sqrt(n),arr[i][0],arr[i][1]));
        }
        Collections.sort(list, new sortdis());
        int[][] res = new int[k][2];
        for(int i=0; i<k; i++){
            res[i][0] = list.get(i).x;
            res[i][1] = list.get(i).y;
        }
        return res;
    }
    
}
class pair{
    double dis;
    int x;
    int y;
    
    pair(double dis,int x,int y){
        this.dis = dis;
        this.x = x;
        this.y = y;
    }
}
class sortdis implements Comparator<pair>{
    public int compare(pair p1, pair p2)
{
    double delta= p1.dis - p2.dis;
    if(delta > 0) return 1;
    if(delta < 0) return -1;
    return 0;
}
}