class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if(ruleKey.compareTo("type")==0){
            for(int i=0; i<items.size(); i++){
                if(ruleValue.compareTo(items.get(i).get(0))==0)count++;
            }
        }
        else if(ruleKey.compareTo("color")==0){
            for(int i=0; i<items.size(); i++){
                if(ruleValue.compareTo(items.get(i).get(1))==0)count++;
            }
        }
        else if(ruleKey.compareTo("name")==0){
            for(int i=0; i<items.size(); i++){
                if(ruleValue.compareTo(items.get(i).get(2))==0)count++;
            }
        }
        return count;
    }
}