class Solution {
    public boolean canMeasureWater(int j1, int j2, int targetCapacity) {
        if(j1+j2==targetCapacity)return true;
        if((j1+j2)<targetCapacity)return false;
        
        // if(j1%2==0 && j2%2==0 && targetCapacity%2!=0)return false;
        
        int total = j1+j2;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        HashSet<Integer> set = new HashSet<>();
        
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int i=0; i<size; i++){
                int temp = q.remove();
                if(temp==targetCapacity)return true;
                
                if((temp+j1)<=total && set.add(temp+j1)==true)
                    q.add(temp+j1);
                if((temp+j2)<=total && set.add(temp+j2)==true)
                    q.add(temp+j2);
                if((temp-j1)>=0 && set.add(temp-j1)==true)
                    q.add(temp-j1);
                if((temp-j2)>=0 && set.add(temp-j2)==true)
                    q.add(temp-j1);
            }
        }
        return false;
        
    }
}