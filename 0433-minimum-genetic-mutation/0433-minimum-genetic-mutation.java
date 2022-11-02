class Solution {
    char[]ch= {'A', 'C', 'G', 'T'};
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> set = new HashSet<>();
        for(String s : bank)set.add(s);
        
        Queue<String>q = new LinkedList<>();
        q.add(start);
        
        HashSet<String> visited =  new HashSet<>();
        visited.add(start);
        
        int count = 0;
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int ii=0; ii<s; ii++){
                String t = q.remove();
                if(t.equals(end))return count;
                
                char temp[] = t.toCharArray();
                for(int i=0; i<start.length(); i++){
                    char old = temp[i];
                    for(char c : ch){
                        temp[i]=c;
                        String next = new String(temp);
                        if(!visited.contains(next)&&set.contains(next)){
                            q.add(next);
                            visited.add(next);
                        }
                    }
                    temp[i] = old;
                }
            }
            count++;
        }
        return -1;
    }
}