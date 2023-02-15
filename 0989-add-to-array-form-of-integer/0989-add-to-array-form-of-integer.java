class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=arr.length-1; i>=0; i--){
            carry += arr[i]+k%10;
            k/=10;
            list.add(0,carry%10);
            carry = carry/10;
        }
        while(k>0){
            carry += k%10;
            k/=10;
            list.add(0,carry%10);
            carry = carry/10;
        }
        if(carry!=0)
            list.add(0,carry);
        
        return list;
    }
}