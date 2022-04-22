class MyHashMap {
    ArrayList<pair> list;
    public MyHashMap() {
        list = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean found = false;
       for(int i=0; i<list.size(); i++){
           if(list.get(i).key==key){
               list.get(i).value = value;
               found = true;
           }
       }
        if(found == false)list.add(new pair(key,value));
    }
    
    public int get(int key) {
        boolean found = false;
        for(int i=0; i<list.size(); i++){
           if(list.get(i).key==key){
               return list.get(i).value;
           }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).key==key){
                list.remove(i);
                break;
            }
        }
    }
}
//can use map otherwise use array with class pair

class pair{
    int key;
    int value;
    
    pair(int k,int v){
        key = k;
        value = v;
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */