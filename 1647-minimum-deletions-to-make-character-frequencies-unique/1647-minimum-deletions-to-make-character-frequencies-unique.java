class Solution {
    public int minDeletions(String s) {
        
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        
        for(int i=0; i<26; i++){
            if(set.contains(arr[i])){
                while(arr[i]>0){
                    count++; arr[i]--;
                    if(set.contains(arr[i])==false){
                        set.add(arr[i]);
                        break;
                    }
                }
            }
            else if(arr[i]!=0){
                set.add(arr[i]);
            }
        }
        return count;
    }
}