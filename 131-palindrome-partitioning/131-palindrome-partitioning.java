class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>>matrix = new ArrayList<>();
        solve(s,0,new ArrayList<>(),matrix);
        return matrix;
        
    }
    void solve(String str,int index,List<String> list, List<List<String>>matrix){
        if(index==str.length()){
            matrix.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<str.length(); ++i){
            if(isPalindrome(str,index,i)){
                list.add(str.substring(index,i+1));
                solve(str,i+1,list,matrix);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str,int start,int end){  
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;end--;
            }
            else return false;
        }
        return true;
    }  
}