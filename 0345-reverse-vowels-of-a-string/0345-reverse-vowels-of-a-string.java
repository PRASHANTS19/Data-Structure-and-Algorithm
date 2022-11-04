class Solution {
    public String reverseVowels(String s) {
        HashSet<Character>set = new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        char arr[] = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : arr){
            if(set.contains(c)){
                stack.push(c);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                arr[i]=stack.pop();
            }
        }
        return new String(arr);
    }
}