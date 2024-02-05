class Solution {
    public String minWindow(String s, String t) {
        int scount[] = new int[200];
        int tcount[] = new int[200];
        
        for(int i=0; i<t.length(); i++){
            tcount[t.charAt(i)-'A']++;
        }
        
        int i=0, j=0;
        int min = (int)1e5;
        String fans = "";
        int left = -1;
        int right = -1;
        while(j<s.length() && i<s.length())
        {
            scount[s.charAt(j)-'A']++;
            if(j-i+1>=t.length()){
                // System.out.print("i="+i + " "+ "j="+j);
                while(check(scount,tcount) && i<=j){
                    if(min>j-i){
                        min = j-i;
                        String ans = "";
                        left = i;
                        right = j;
                    }
                    scount[s.charAt(i)-'A']--;
                    i++;
                }
            }
            j++;
            
        }   
        if(right!=-1 && left!=-1){
            for(int x = left; x<=right; x++){
                fans += s.charAt(x);
            }
        } 
        return fans;
    }
    boolean check(int scount[],int tcount[]){
        
        for(int i=0; i<200; i++){
            if(tcount[i]>0){
                if(scount[i]<tcount[i])return false;
            }
        }
        return true;
    }
}