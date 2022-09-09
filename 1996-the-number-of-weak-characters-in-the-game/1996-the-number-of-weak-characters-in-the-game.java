class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        int count = 0;
        int n =arr.length;
        Arrays.sort(arr,(p,q)->(p[0]==q[0])?p[1]-q[1] : q[0]-p[0]);

        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i][1]<max)count++;
            
            max = Math.max(arr[i][1],max);
        }
        return count;
        
    }
}