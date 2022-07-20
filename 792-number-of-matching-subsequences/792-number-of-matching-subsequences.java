class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        ArrayList<ArrayList<Integer>>list= new ArrayList<>();
        
        for(int i=0; i<26; i++)
            list.add(new ArrayList<>());
        
        for(int i=0; i<s.length(); i++){
            list.get(s.charAt(i)-'a').add(i);
        }
        int count = 0;
        for(String str : words){
            int lastChange = -1;
            boolean flag = false;
            //aa
            for(int i=0; i<str.length(); i++){
                int prev = lastChange;
                ArrayList<Integer> ll = list.get(str.charAt(i)-'a');
                
                for(int x : ll){
                    if(x>lastChange){
                        flag = true;
                        lastChange = x;
                        break;
                    }
                }
                if(lastChange==prev){
                    flag = false;
                    break;
                }
            }
            if(flag)count++;
        }
        return count;
    }
}