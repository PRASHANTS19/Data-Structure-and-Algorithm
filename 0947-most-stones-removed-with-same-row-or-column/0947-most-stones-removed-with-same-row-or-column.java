class Solution {
     public int removeStones(int[][] stones) {
        if(stones == null) {
            return 0;
        }
       
        int islandsCount = 0;
        Set<String> visited = new HashSet();
        for(int i=0; i<stones.length; i++) {
            if(!visited.contains(stones[i][0]+"-"+stones[i][1])) {
                islandsCount++;
                helper(stones, stones[i][0], stones[i][1], visited);
            } 
        }
        return stones.length-islandsCount;
    }
    private void helper(int[][] stones, int row, int col, Set<String> visited){
        visited.add(row+"-"+col);
        for(int[] stone : stones) {
            if((stone[0]==row || stone[1]==col) && !visited.contains(stone[0]+"-"+stone[1])){
                helper(stones, stone[0], stone[1], visited);
            }
        }
    }
}