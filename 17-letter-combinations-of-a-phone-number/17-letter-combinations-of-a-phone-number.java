class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>list = new ArrayList<>();
        if(digits.length()==0)return list;
        
        String arr[] = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        
        solve(arr,digits,0,new StringBuilder(),list);
        return list;
        
    }
    void solve(String arr[],String digits,int i,StringBuilder res,List<String> list){
        if(i==digits.length()){
            list.add(res.toString());
            return;
        }
        
        String curr =  arr[Integer.parseInt(digits.charAt(i)+"")];
        for(int j=0; j<curr.length(); j++){
            res.append(curr.charAt(j));
            solve(arr,digits,i+1,res,list);
            res.deleteCharAt(res.length()-1);
        }
    }
}