class Bitset {

    int n;
    HashSet<Integer>one;
    HashSet<Integer> zero;
    public Bitset(int size) {
        one = new HashSet<>();
        zero = new HashSet<>();
        n = size;
        for(int i=0; i<size; i++){
            zero.add(i);
        }
    }
    
    public void fix(int idx) {
        one.add(idx);
        zero.remove(idx);
    }
    
    public void unfix(int idx) {
        one.remove(idx);
        zero.add(idx);
    }
    
    public void flip() {
        HashSet<Integer>s = one;
        one = zero;
        zero = s;
    }
    
    public boolean all() {
        return (one.size()==n);
    }
    
    public boolean one() {
        return one.size()>0;
    }
    
    public int count() {
        return one.size();
    }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++){
            if(one.contains(i))res.append('1');
            else res.append('0');
        }
        return res.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */