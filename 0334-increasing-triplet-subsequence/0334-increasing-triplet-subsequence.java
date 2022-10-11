class Solution {
    public boolean increasingTriplet(int[] arr) {
        int small=Integer.MAX_VALUE,big=Integer.MAX_VALUE;
        
        for(int i : arr){
            if(small>=i)small=i;
            else if(big>=i)big = i;
            else return true;
        }
        return false;
    }
}