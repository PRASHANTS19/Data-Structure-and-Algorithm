class WordDictionary {
    ArrayList<ArrayList<String>> matrix = new ArrayList<>();
    public WordDictionary() {
       for(int i=0; i<=501; i++){
           matrix.add(new ArrayList<>());
       }
    }
    
    public void addWord(String word) {
        int size = word.length();
        matrix.get(size).add(word);
    }
    
    public boolean search(String word) {
        int size = word.length();
        boolean flag = false;
        for(int i=0; i<matrix.get(size).size(); i++){
            String s = matrix.get(size).get(i);
            for(int j=0; j<size; j++){
                if(word.charAt(j)=='.'){
                    flag = true;
                    continue;
                }
                else if(word.charAt(j)!=s.charAt(j)){
                    flag = false;
                    break;
                }
                else flag = true;
            }
            if(flag==true)return flag;
        }
        return flag;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */