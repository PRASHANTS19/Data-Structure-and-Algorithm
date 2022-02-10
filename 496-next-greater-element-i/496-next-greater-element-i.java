class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int res[] = new int[n];
        nge(nums2,res,n);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.put(nums2[i],res[i]);
        }
        int x[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            x[i] = map.get(nums1[i]);
        }
        return x;
       
        
    }
    void nge(int arr[] , int res[],int n){
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(stack.isEmpty()){  
                res[i]=-1;
            }
            else if(stack.peek()>arr[i]){
                res[i] = stack.peek();
            }
            else{
                while(stack.peek()<arr[i]){
                    stack.pop();
                    if(stack.isEmpty()){
                        res[i]=-1;
                        break;
                    }
                    else if(stack.peek()>arr[i]){
                        res[i] = stack.peek();
                        break;
                    }
                }
            }
            stack.push(arr[i]);
        }
    }
}