class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        pair arr[] = new pair[m];
        
        for(int i=0; i<m; i++){
            int c=0;
            for(int j=0; j<n; j++){
                if(mat[i][j]==0)break;
                else c++;
            }
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