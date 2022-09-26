class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int left=0,top=0;
        int right = col-1,bottom = row-1;
        
        int dir = 0;
        while(left<=right && top<=bottom){
            if(dir==0){
                for(int i=left; i<=right; i++){
                    list.add(arr[top][i]);
                }
                top++;
            }
            else if(dir==1){
                for(int i=top; i<=bottom; i++){
                    list.add(arr[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(int i=right; i>=left; i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            else if(dir==3){
                for(int i=bottom; i>=top; i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
            dir++;
            dir %=4;
            
        }
    return list;
        
    }
}