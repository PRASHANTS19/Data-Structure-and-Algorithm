class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int counttop[] = new int[7];
        int countbottom[] = new int[7];
        int same[] = new int[7];
        
        for(int i=0; i<n; i++){
            counttop[tops[i]]++;
            countbottom[bottoms[i]]++;
            
            if(tops[i]==bottoms[i])
                same[tops[i]]++;
        }
        
        for(int i=0; i<7; i++){
            if(counttop[i]+countbottom[i]-same[i]==n)
                return n-Math.max(counttop[i],countbottom[i]);
        }

        return -1;        
        }
}