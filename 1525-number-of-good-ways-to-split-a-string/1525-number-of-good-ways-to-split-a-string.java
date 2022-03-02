class Solution {
    public int numSplits(String s) {
        int n = s.length();
        if(n==1)return 0;
        char arr[] = s.toCharArray();
        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();
        
        m1.put(arr[0],1);
        for(int i=1; i<n; i++){
            m2.put(arr[i],m2.getOrDefault(arr[i],0)+1);
        }
        int j=1; int count = 0;
        for(int i=1; i<n; i++){
            if(m1.size()==m2.size())count++;
            char c = arr[i];
            m1.put(c,m1.getOrDefault(c,0)+1);
            m2.put(c,m2.get(c)-1);
            if(m2.get(c)==0)m2.remove(c);
            
        }
        return count;
        
    }
}