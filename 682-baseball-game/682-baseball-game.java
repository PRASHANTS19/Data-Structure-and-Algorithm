class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("C"))stack.pop();
            else if(arr[i].equals("D"))stack.push(stack.peek()*2);
            else if(arr[i].equals("+")){
                int f = stack.pop();
                int sum = f+stack.peek();
                stack.push(f);
                stack.push(sum);
            }
            else{
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        int res=0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}