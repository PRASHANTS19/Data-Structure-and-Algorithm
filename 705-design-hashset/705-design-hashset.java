class MyHashSet {
    HashSet<Integer> q;
    public MyHashSet() {
        q = new HashSet<>();
    }
    
    public void add(int key) {
        q.add(key);
    }
    
    public void remove(int key) {
        q.remove(key);
    }
    
    public boolean contains(int key) {
        return q.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */