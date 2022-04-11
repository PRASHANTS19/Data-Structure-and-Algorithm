class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int m = arr.length;
        int n = arr[0].length;
        
        if(k>m*n)k=k%(m*n);
        
        List<List<Integer>>list = new ArrayList<>();
        for(int i=0; i<m; i++){
            list.add(new ArrayList<>());
        }
        int count = 1;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(count<=k)stack1.push(arr[i][j]);
                else stack2.push(arr[i][j]);
                count++;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!stack1.isEmpty()){
                    list.get(i).add(stack1.pop());
                }
                else
                    list.get(i).add(stack2.pop());
            }
        }
        return list;
        
    }
}