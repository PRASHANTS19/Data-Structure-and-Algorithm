class Solution {
    public int findComplement(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(num>0){
            if(num%2==0)
                list.add(1);
            else if(num%2==1)
                list.add(0);
            
            num = num>>1;
        }
        int res = 0;
        for(int i=0; i<list.size(); i++){
            res += list.get(i)*Math.pow(2,i);
        }
        return res;
    }
}