class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        
        for(int i=0; i<arr.length; i++){
            
            while(stack.isEmpty()!=true && arr[i]>arr[stack.peek()]){
                int ind = stack.pop();
                ans[ind] = i-ind;
            }
            stack.push(i);
        }
        return ans;
        
    }
}