class Solution {
    public String addBinary(String a, String b) {  
       if(a.length()<b.length())
          return addBinary(b,a);
    
        
        int sum =0;
        StringBuilder ans = new StringBuilder();
        int n1 = a.length()-1;
        int n2 = b.length()-1;
        
        System.out.print(a + " " + b);
        
        while(n2>=0 && n1>=0){
            sum += (a.charAt(n1--)-'0')+(b.charAt(n2--)-'0');
            char c= (char)(sum%2 + '0');
            sum /=2;
            ans.append(c);
        }
        while(n1>=0){
            sum += (a.charAt(n1--)-'0');
            char c= (char)(sum%2 + '0');
            sum /=2;
            ans.append(c);
        }
        if(sum!=0)
            ans.append((char)(sum%2 + '0'));
        return ans.reverse().toString();
        
    }
}