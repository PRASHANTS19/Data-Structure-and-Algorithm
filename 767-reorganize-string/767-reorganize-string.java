class Solution {
    public String reorganizeString(String s) {
        if(s.length()==0)return "";
        
        int freq[] = new int[27];
        
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        
        PriorityQueue<pair> q = new PriorityQueue<>((x,y)->y.count-x.count);
        
        for(int i=0; i<27; i++){
            if(freq[i]==0)continue;
            char x = (char)(i+97);
            q.add(new pair(x,freq[i]));
        }
        
        StringBuilder res = new StringBuilder();
        while(q.isEmpty()!=true){
            if(res.length()==0){
                res.append(q.peek().c);  
                q.peek().count--;
                if(q.peek().count==0)q.remove();
            }
            else{
                if(q.peek().c==res.charAt(res.length()-1)){
                    pair temp = q.remove();
                    if(q.size()==0)return "";
                    res.append(q.peek().c);  
                    q.peek().count--;
                    if(q.peek().count==0)q.remove();
                    q.add(temp);
                }
                else{
                    res.append(q.peek().c);  
                    q.peek().count--;
                    if(q.peek().count==0)q.remove();
                }
            }
            // if(q.peek().count==0)q.remove();
        }
        return res.toString();
    }
}
class pair{
    char c;
    int count;
    
    pair(char ch,int cou){
        c = ch;
        count = cou;
    }
}