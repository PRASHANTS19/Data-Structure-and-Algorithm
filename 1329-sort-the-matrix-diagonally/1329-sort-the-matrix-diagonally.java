class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int row = mat.length;
        int col = mat[0].length;
        
        for(int i=0; i<col; i++){
            int l=0,r=i;
            ArrayList<Integer> list = new ArrayList<>();
            while(l<row && r<col){
                list.add(mat[l][r]);
                l++; r++;
            }
            Collections.sort(list);
            int k=0;
            l=0; r=i;
            while(l<row && r<col){
                mat[l][r]=list.get(k++);
                l++; r++;
            }
        }
        for(int i=0; i<row; i++){
            int l=i,r=0;
            ArrayList<Integer> list = new ArrayList<>();
            while(l<row && r<col){
                list.add(mat[l][r]);
                l++; r++;
            }
            Collections.sort(list);
            int k=0;
            l=i; r=0;
            while(l<row && r<col){
                mat[l][r]=list.get(k++);
                l++; r++;
            }
        }
        return mat;
        
    }
}