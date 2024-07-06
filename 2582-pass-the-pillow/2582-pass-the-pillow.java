class Solution {
    public int passThePillow(int n, int time) {
        
        int i=1;
        boolean flag = true;
        while(time>0){
            if(flag)i++;
            else i--;
            
            if(i==n)flag = !flag;
            else if(i==1)flag = !flag;
            time--;
        }
        
        return i;
    }
}