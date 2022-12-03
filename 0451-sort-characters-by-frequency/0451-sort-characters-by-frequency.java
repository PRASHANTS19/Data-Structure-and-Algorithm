class Solution {
    public String frequencySort(String s) {
        
        int freq[] = new int[130];
        
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i=0; i<130; i++){
            if(freq[i]!=0){
                list.add(new int[]{i,freq[i]});
            }
        }
        Collections.sort(list,(p,q)->p[1]==q[1]?p[0]-q[0]:q[1]-p[1]);
        
        String ans = "";
        
        for(int i=0; i<list.size(); i++){
            
            for(int j=0; j<list.get(i)[1]; j++){
                ans += (char)(list.get(i)[0]);
            }
        }
        return ans;
        
        
        
    }
}
class pair{
    char c;
    int freq;
    
    pair(char ch,int f){
        c = ch;
        freq = f;
    }
}

