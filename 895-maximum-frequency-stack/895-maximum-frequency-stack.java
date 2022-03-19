class FreqStack {
    HashMap<Integer,Integer> freq;
    HashMap<Integer,Stack<Integer>> map;
    int maxfreq=0;
    public FreqStack() {
        freq = new HashMap<>();
        map = new HashMap<>();
    }
    
    public void push(int val) {
        int f = freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        maxfreq = Math.max(maxfreq,f);
        if(map.containsKey(f)!=true)map.put(f,new Stack<>());
        map.get(f).add(val);
    }
    
    public int pop() {
        int x = map.get(maxfreq).pop();
        freq.put(x,maxfreq-1);
        if(map.get(maxfreq).size()==0)maxfreq--;
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

