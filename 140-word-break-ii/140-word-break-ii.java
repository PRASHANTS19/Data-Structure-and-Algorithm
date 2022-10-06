class Solution {
    List<String>ans = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> w) {
        HashSet<String> set = new HashSet<>();
        
        for(String ss : w){
            set.add(ss);
        }
        
        solve(s,1,0,set,new ArrayList<>());
        return ans;
    }
    void solve(String s,int i,int j,HashSet<String> set,ArrayList<String>list){
        if(i>=s.length() || j>=s.length()){
            String temp = s.substring(j,i);
            if(set.contains(temp)){
                String a = addS(list)+temp;
                ans.add(a);
                return;
            }
            return;
        }
        String x = s.substring(j,i);
        if(set.contains(x)){
            list.add(x);
            solve(s,i+1,i,set,list);
            list.remove(list.size()-1);
        }
        solve(s,i+1,j,set,list);
    }
    String addS(ArrayList<String>list){
        String s = "";
        for(int i=0; i<list.size(); i++){
            s += (list.get(i)+" ");
        }
        
        return s;
    }
}