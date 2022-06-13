class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>matrix = new ArrayList<>();
        
        solve(0,s.length(),s,matrix,new ArrayList<>());
        return matrix;
        
    }
    void solve(int i,int n,String str,List<List<String>>matrix, List<String>list){
        
        if(i==n){
            matrix.add(new ArrayList<>(list));
            return;
        }
        
        for(int j=i; j<n; j++){
            if(pal(str,i,j)){
                list.add(str.substring(i,j+1));
                solve(j+1,n,str,matrix,list);
                list.remove(list.size()-1);
            }
        }
    }
    boolean pal(String str, int i,int j){
        
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}