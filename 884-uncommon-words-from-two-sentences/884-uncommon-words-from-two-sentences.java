class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        
        for(int i=0; i<arr1.length; i++){
            if(map1.containsKey(arr1[i])){
                map1.put(arr1[i],map1.get(arr1[i])+1);
            }
            else{
                map1.put(arr1[i],1);
            }
            // map1.put(arr1[i],map1.getOrDefault(map1.get(arr1[i]),0)+1);
        }
         for(int i=0; i<arr2.length; i++){
             if(map2.containsKey(arr2[i])){
                map2.put(arr2[i],map2.get(arr2[i])+1);
            }
            else{
                map2.put(arr2[i],1);
            }
            // map2.put(arr2[i],map2.getOrDefault(map2.get(arr2[i]),0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<arr1.length; i++){
            if(map1.get(arr1[i])==1 && map2.containsKey(arr1[i])==false)list.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++){
            if(map2.get(arr2[i])==1 && map1.containsKey(arr2[i])==false)list.add(arr2[i]);
        }
        String res[] = new String[list.size()];
        int k=0;
        for(String s : list){
            res[k] = s;
            k++;
        }
        return res;
        
    }
}