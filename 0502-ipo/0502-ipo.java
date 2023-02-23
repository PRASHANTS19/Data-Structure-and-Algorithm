class Solution {
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        
        PriorityQueue<int[]> cap = new PriorityQueue<>((pp,qq)->pp[1]-qq[1]);
        PriorityQueue<int[]> pro = new PriorityQueue<>((pp,qq)->qq[0]-pp[0]);
        
        for(int i=0; i<c.length; i++){
            cap.add(new int[]{p[i],c[i]});
        }
        
        for(int i=0; i<k; i++){
            while(cap.size()>0 && cap.peek()[1]<=w){
                pro.add(cap.remove());
            }
            if(pro.isEmpty())break;
            
            w += pro.remove()[0];
        }
        return w;
    }
}