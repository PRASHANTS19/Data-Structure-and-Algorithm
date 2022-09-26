class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String arr[] = new String[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(arr,(p,q)->(q+p).compareTo(p+q));
        
        StringBuilder res = new StringBuilder();
        for(String s : arr){
            res.append(s);
        }
        
        boolean flag = false;
        String ans = "";
        
//         for(int i=0; i<res.length(); i++){
            
//             if(s.charAt(i)!='0'){
//                 flag = true;
//             }
//             if(flag)
//                 ans += res.charAt(i); 
            
//             if(flag==false){
//                 if(res.charAt(i)=='0')continue;
//             }
//         }
        
        if(res.charAt(0)=='0' && ans=="")return "0";
        return res.toString();
    }
}