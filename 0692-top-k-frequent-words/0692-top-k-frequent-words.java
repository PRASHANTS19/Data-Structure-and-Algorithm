class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<pair> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            // System.out.println(entry.getKey() + " " + entry.getValue());
            list.add(new pair(entry.getKey(),entry.getValue()));
        }
        Collections.sort(list,(p,q)->(q.freq==p.freq)?(p.s).compareTo(q.s):(q.freq-p.freq));
        // for(pair x : list){
        //     System.out.println(x.s + " " + x.freq);
        // }
        
        List<String> ans = new ArrayList<>();
        for(int i=0; i<k; i++){
            ans.add(list.get(i).s);
        }
        return ans;
    }
}
class pair{
    String s;
    int freq;
    
    pair(String ss,int f){
        s= ss;
        freq=f;
    }
}