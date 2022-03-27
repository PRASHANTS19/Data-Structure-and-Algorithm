class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        pair arr[] = new pair[m];
        
        for(int i=0; i<m; i++){
            int c=0;
            int low = 0; int high = n-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(mat[i][mid]==1)low=mid+1;
                else high=mid-1;
            }
            c=high;
            arr[i] = new pair(i,c);
        }
        Arrays.sort(arr,(p,q)->(p.count-q.count));
        int res[] = new int[k];
        
        for(int i=0; i<k; i++){
            res[i] = arr[i].index;
        }
        return res;
    }
}
class pair{
    int index;
    int count;
    
    pair(int i, int c){
        index  = i;
        count = c;
    }
}