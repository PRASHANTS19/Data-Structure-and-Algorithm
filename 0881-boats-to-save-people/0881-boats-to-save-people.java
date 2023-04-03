class Solution {
    public int numRescueBoats(int[] arr, int l) {
        Arrays.sort(arr);
        
        int count=0;
        int i=0; int j=arr.length-1;
        
        int w = 0;
        
        int person = 0;
        while(i<=j){
            boolean flag = false;
            if(w+arr[j]<=l){
                w+= arr[j];
                j--;
                person++;
                flag=true;
            }
            else if(w+arr[i]<=l){
                w+= arr[i];
                i++;
                person++;
                flag=true;
            }
            
            if(flag == false || person==2){
                count++;
                person = 0;
                w=0;
            }
        }
        if(w!=0)count++;
        
        return count;
    }
}