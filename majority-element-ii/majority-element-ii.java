class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==num1)c1++;
            else if(arr[i]==num2)c2++;
            else if(c1==0){
                num1 = arr[i];
                c1 = 1;
            }
            else if(c2==0){
                num2 = arr[i];
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i=0; i<n; i++){
            if(arr[i]== num1)c1++;
            else if(arr[i]==num2)c2++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(c1>n/3)list.add(num1);
        if(c2>n/3)list.add(num2);
        return list;
        
    }
}