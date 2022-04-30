class Solution {
    public double[] calcEquation(List<List<String>> list, double[] values, List<List<String>> queries) {
     
        HashMap<String,ArrayList<pair>> map = new HashMap<>();
        
        for(int i=0; i<list.size(); i++){
            String f = list.get(i).get(0);
            String s = list.get(i).get(1);
            
            if(map.containsKey(f)){
                map.get(f).add(new pair(s,values[i]));
            }
            else{
                map.put(f,new ArrayList<>());
                map.get(f).add(new pair(s,values[i]));
            }
            if(map.containsKey(s)){
                map.get(s).add(new pair(f,1/values[i]));
            }
            else{
                map.put(s,new ArrayList<>());
                map.get(s).add(new pair(f,1/values[i]));
            }
            
        }
        double[] res = new double[queries.size()];
        
        for(int i=0; i<queries.size(); i++){
            
            res[i] = dfs(queries.get(i).get(0),queries.get(i).get(1),map,1.0,new HashSet<>());
            if(res[i]==0.0)res[i]=-1.0;
        }
        return res;
        
    }
    
    double dfs(String start,String end,HashMap<String,ArrayList<pair>> map,double value,HashSet<String>set){
        if(set.contains(start))return 0.0;
        if(!map.containsKey(start))return 0.0;
        if(start.equals(end))return value;
        set.add(start);
        
        ArrayList<pair> list = map.get(start);
        double temp = 0.0;
        
        for(pair x : list){
            temp = dfs(x.first,end,map,value*x.val,set);
            if(temp!=0.0)break;
        }
        set.remove(start);
        return temp;
        
    }
}
class pair{
    String first;
    double val;
    
    pair(String f,double v){
        first = f;
        val = v;
    }
}