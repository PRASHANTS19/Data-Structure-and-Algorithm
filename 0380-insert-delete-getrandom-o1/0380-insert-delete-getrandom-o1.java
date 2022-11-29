class RandomizedSet {
    HashSet<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = set.toArray(new Integer[set.size()]);
  
        // generate a random number
        Random rndm = new Random();
  
        // this will generate a random number between 0 and
        // HashSet.size - 1
        int rndmNumber = rndm.nextInt(set.size());
  
        // get the element at random number index
        return arrayNumbers[rndmNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */